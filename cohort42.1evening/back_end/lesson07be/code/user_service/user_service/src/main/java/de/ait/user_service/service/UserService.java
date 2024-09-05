package de.ait.user_service.service;

import de.ait.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> getAll();

    public List<User> getAllUser();
    public List<User> getByName(String name);
    public  User getById(Long id);
    public  User save(User user);
    public User delete(Long id);

}
