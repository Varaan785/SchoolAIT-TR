package de.ait.shop42.security.accounting.user.service;

import de.ait.shop42.exception.DuplicateUsernameException;
import de.ait.shop42.security.accounting.role.entity.Role;
import de.ait.shop42.security.accounting.role.service.RoleService;
import de.ait.shop42.security.accounting.user.dto.UserRequestDto;
import de.ait.shop42.security.accounting.user.dto.UserResponseDto;
import de.ait.shop42.security.accounting.user.entity.User;
import de.ait.shop42.security.accounting.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder;
    private final RoleService roleService;
    private final ModelMapper mapper;

    @Override
    public UserResponseDto createNewUser(UserRequestDto dto) {
        Optional<User> userByName = repository.findUserByName(dto.getName());
        if (userByName.isPresent()){
            throw new DuplicateUsernameException("User with name: " + dto.getName() + " already exists");
        } else {
            Role roleUser = roleService.getRoleByTitle("ROLE_USER");
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleUser);
            String encodedPassword = encoder.encode(dto.getPassword());
            User user = new User(null,
                    dto.getName(),
                    dto.getEmail(),
                    encodedPassword,
                    roles);
            User savedUser = repository.save(user);
            return mapper.map(savedUser,UserResponseDto.class);
        }

    }

    @Override
    public List<UserResponseDto> getUsers() {
        return repository.findAll()
                .stream()
                .map(u->mapper.map(u,UserResponseDto.class))
                .toList();
    }

    @Override
    public UserResponseDto setRoleAdmin(String username) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findUserByName(username)
                .orElseThrow(()->new UsernameNotFoundException("User with name " + username + " not found" ));
    }
}
