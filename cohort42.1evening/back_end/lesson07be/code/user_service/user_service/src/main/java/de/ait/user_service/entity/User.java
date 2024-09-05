package de.ait.user_service.entity;

import lombok.*;
import org.springframework.objenesis.SpringObjenesis;

import java.sql.Driver;
//@NoArgsConstructor  // leere konstruktion
@AllArgsConstructor
@RequiredArgsConstructor // zwingende
@Getter // getter die kann man auch für einzelne felder nutzen, wenn man über feld nutzt @Getter
@Setter // analogisch wie @Getter
@ToString
@EqualsAndHashCode (of={"id","email"}) // hash code und equals, man kann auch @EqualsAndHashCode (of={"id","email"})
@Builder

public class User {
    private Long id;
    final String name;
    final String email;
    final String password;
}
