package de.ait.homework13be.controller;

import de.ait.homework13be.dto.WordRequestDTO;
import de.ait.homework13be.dto.WordResponseDTO;
import de.ait.homework13be.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class WordController {
    private final WordService wordService;

    @GetMapping("/wortkarte")
    public List<WordResponseDTO> getWords() {
        return wordService.getAllWords();
    }

    @PostMapping("/wortkarte")
    public WordResponseDTO creatWord (@RequestBody WordRequestDTO dto) {
        return wordService.createNewWord(dto);
    }
}
