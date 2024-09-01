package de.ait.homework15be.repository;

import de.ait.homework15be.entity.Wortkarte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WordRepository extends JpaRepository<Wortkarte, Long> {

    // Sucht nach allen Wortkarten mit der angegebenen Kombination von Sprache und Übersetzungssprache
    List<Wortkarte> findByLanguageAndTranslateLanguage(String language, String translateLanguage);

    // Sucht nach einer Wortkarte mit dem angegebenen Wort
    Optional<Wortkarte> findByWord(String word);
}


