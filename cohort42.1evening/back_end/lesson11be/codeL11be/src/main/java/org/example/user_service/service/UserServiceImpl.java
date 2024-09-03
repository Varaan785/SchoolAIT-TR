package org.example.user_service.service;

package de.ait.user_service.service;

import de.ait.user_service.dto.UserCreateDto;
import de.ait.user_service.dto.UserResponseDto;
import de.ait.user_service.entity.User;
import de.ait.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private final  UserRepository repository;

    @Autowired
    public UserServiceImpl(@Qualifier("actualRepository")UserRepository repository) {
        this.repository = repository;
    }

    /*
    private final UserRepository repository1;
    private final UserRepository repository2;

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(@Qualifier("userRepositoryJDBCImpl") UserRepository repository1,
                           @Qualifier("userRepositoryImpl") UserRepository repository2) {
        this.repository1 = repository1;
        this.repository2 = repository2;
        if (!check(repository1)){
            repository = repository2;
        } else {
            repository = repository1;
        }
    }

     */

    @Override
    public List<UserResponseDto> getAll() {
        return UserResponseDto.of(repository.findAll());
    }

    @Override
    public List<UserResponseDto> getByName(String name) {
        return getAll()
                .stream()
                .filter(user -> user.getName().equals(name))
                .toList();
    }

    @Override
    public UserResponseDto getById(Long id) {
        User findUser = repository
                .findAll()
                .stream()
                .filter(user -> user.getId().equals(id))
                .findAny()
                .get();
        return UserResponseDto.of(findUser);
    }

    @Override
    public UserResponseDto create(UserCreateDto userDto) {
        User newUser = new User(null,userDto.getName(), userDto.getEmail(), userDto.getPassword());
        return UserResponseDto.of(repository.save(newUser));
    }

    @Override
    public UserResponseDto delete(Long id) {
        return UserResponseDto.of(repository.delete(id));
    }

    @Override
    public UserResponseDto update(Long id, UserCreateDto dtoUser) {
        User user = new User(id, dtoUser.getName(), dtoUser.getEmail(), dtoUser.getPassword());
        return UserResponseDto.of(repository.save(user));
    }
}
