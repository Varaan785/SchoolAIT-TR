package de.ait.user_service.entity;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode (of={"id","email"})
//@EqualsAndHashCode (exclude={"id","email"})
@Builder
@Setter
public class User {
    @Setter
    private Long id;
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
