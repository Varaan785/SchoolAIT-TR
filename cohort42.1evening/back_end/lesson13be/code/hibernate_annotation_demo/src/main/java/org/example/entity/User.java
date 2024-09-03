package org.example.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
