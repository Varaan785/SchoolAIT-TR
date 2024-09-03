package org.example.user_service;

import de.ait.user_service.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(UserServiceApplication.class, args);
	System.out.println();

}

}
