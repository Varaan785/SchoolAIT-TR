package de.ait.homework13be.service;

import de.ait.homework13be.dto.WordRequestDTO;
import de.ait.homework13be.dto.WordResponseDTO;

import java.util.List;

public interface WordService {
    List<WordResponseDTO> getAllWords();
    WordResponseDTO createNewWord(WordRequestDTO wordRequestDTO);
}
