package de.ait.user_service.controller;


import de.ait.user_service.entity.User;
import de.ait.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;


    // "api/users"  GET
    // "/api/users?name=jack
    @GetMapping("api/users")
    public List<User> getAllUsers(@RequestParam(name ="name", required = false, defaultValue = "") String name){
        return service.getAllUser();
    }

    // "/api/users/2"
//    @GetMapping("/api/users/{qwe}")
//    public User getUserById(@PathVariable("qwe") Long id) {
//       return service.getById(id);
//    }

    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable Long id) {
       return service.getById(id);
   }



}
