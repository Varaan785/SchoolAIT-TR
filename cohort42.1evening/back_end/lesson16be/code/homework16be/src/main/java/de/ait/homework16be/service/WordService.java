package de.ait.homework16be.service;

import de.ait.homework16be.dto.WordRequestDTO;
import de.ait.homework16be.dto.WordResponseDTO;

import java.util.List;
import java.util.Optional;


public interface WordService {
    List<WordResponseDTO> getAllWords();
    WordResponseDTO createNewWord(WordRequestDTO wordRequestDTO);

    // Neue Methode zur Suche nach Wortkarten mit der Sprachkombination
    List<WordResponseDTO> findByLanguageAndTranslateLanguage(String language, String translateLanguage);

    // Neue Methode zur Suche nach einer Wortkarte anhand eines Wortes
    Optional<WordResponseDTO> findByWord(String word);
}
