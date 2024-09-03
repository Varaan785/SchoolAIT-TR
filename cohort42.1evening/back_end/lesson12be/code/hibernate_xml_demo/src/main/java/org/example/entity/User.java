package org.example.entity;


import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
}
