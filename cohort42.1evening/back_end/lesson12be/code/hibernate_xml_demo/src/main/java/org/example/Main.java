package org.example;


import org.example.entity.HibernateXMLRepositoryDemo;
import org.example.entity.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HibernateXMLRepositoryDemo repository = new HibernateXMLRepositoryDemo();
        List<User> allUser = repository.findAll();
        System.out.println(allUser);
        System.out.println("---------------------- find By Id ----------------------------");
        System.out.println(repository.findById(2L));
        System.out.println("----------------------------save--------------------------");
        User user = repository.create(new User(null, "Nick" , "nick1@mail.com" , "qwerty"));
        System.out.println(user);

    }
}