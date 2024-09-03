package org.example;


import org.example.entity.HibernateAnnotationRepositoryDemo;
import org.example.entity.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HibernateAnnotationRepositoryDemo repository = new HibernateAnnotationRepositoryDemo();
        List<User> allUser = repository.findAll();
        System.out.println(allUser);
        System.out.println("---------------------- find By Id ----------------------------");
        System.out.println(repository.findById(2L));
        System.out.println("----------------------------save--------------------------");
        User user = repository.create(new User(null, "Nick" , "nick23@mail.com" , "qwerty"));
        System.out.println(user);
    }
}