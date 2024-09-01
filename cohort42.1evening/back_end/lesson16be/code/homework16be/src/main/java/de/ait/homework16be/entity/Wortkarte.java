package de.ait.homework16be.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

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
   @ManyToMany(mappedBy = "words")
   private Set<Group> groups;

}
