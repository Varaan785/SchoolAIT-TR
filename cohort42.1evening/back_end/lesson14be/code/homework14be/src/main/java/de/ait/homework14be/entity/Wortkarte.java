package de.ait.homework14be.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@ToString

@Entity
@Table(name = "wortkarte")
public class Wortkarte {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;
   @Column(name = "language")
   private String  language;
   @Column(name = "word")
   private String  word;
   @Column(name = "example")
   private String example;
   @Column(name = "translate_language")
   private String translateLanguage;
   @Column(name = "translation")
   private String translation;
   @Column(name = "group_name")
   private String groupName;

}
