package de.ait.homework16be.controller;

import de.ait.homework16be.dto.WordRequestDTO;
import de.ait.homework16be.dto.WordResponseDTO;
import de.ait.homework16be.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    // Neuer Endpunkt für die Suche nach Wortkarten mit einer bestimmten Sprachkombination
    @GetMapping("/wortkarte/search")
    public List<WordResponseDTO> getWordsByLanguageAndTranslateLanguage(
            @RequestParam String language,
            @RequestParam String translateLanguage) {
        return wordService.findByLanguageAndTranslateLanguage(language, translateLanguage);
    }

    // Neuer Endpunkt für die Suche nach einer Wortkarte anhand eines Wortes
    @GetMapping("/wortkarte/find")
    public Optional<WordResponseDTO> getWordByWord(@RequestParam String word) {
        return wordService.findByWord(word);
    }
}
