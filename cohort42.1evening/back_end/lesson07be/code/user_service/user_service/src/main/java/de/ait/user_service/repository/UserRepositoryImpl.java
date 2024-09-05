package de.ait.user_service.repository;

import de.ait.user_service.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserRepositoryImpl implements UserRepository{
    List<User> list = List.of(
            new User(1L,"Jack","jack@mail.com","123"),
            new User(1L,"John","john@mail.com","123"),
            new User(1L,"Ann","ann@mail.com","123"),
            new User(1L,"Lena","lena@mail.com","123")
    );

    @Override
    public List<User> findAll() {
        return list;
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User delete(Long id) {
        return null;
    }


}
