package de.ait.user_service.controller;


/*import de.ait.user_service.entity.User;
import de.ait.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;


    // "api/users"  GET
    // "/api/users?name=jack
    @GetMapping("api/users")
    public List<User> getAllUsers(@RequestParam(name ="name", required = false, defaultValue = "") String name){
        return service.getAll();
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

   @PostMapping("/api/users")
    public User addUser(@RequestBody User user) {
       System.out.println(user);
       return user;
   }



}
*/


import de.ait.user_service.entity.User;
import de.ait.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api")
public class UserController {

    private final UserService service;

    // "/api/users" GET
    // "/api/users?name=jack
    @GetMapping("/users")
    public List<User> getAllUsers(@RequestParam(name = "name", required = false, defaultValue = "") String name){
        if(name.equals("")) {
            return service.getAll();
        } else {
            return service.getByName(name);
        }
    }

    // "/api/users/2"
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        service.save(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        service.update(user);
        return user;
    }


}
