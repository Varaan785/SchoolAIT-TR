package de.ait.homework14be.service;

import de.ait.homework14be.dto.WordRequestDTO;
import de.ait.homework14be.dto.WordResponseDTO;
import de.ait.homework14be.entity.Wortkarte;
import de.ait.homework14be.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<WordResponseDTO> getAllWords() {
        return wordRepository.findAll().stream()
                .map(w -> modelMapper.map(w, WordResponseDTO.class))
                .toList();
    }

    @Override
    public WordResponseDTO createNewWord(WordRequestDTO dto) {
        Wortkarte wortkarte = modelMapper.map(dto, Wortkarte.class);
        wortkarte = wordRepository.save(wortkarte);
        return modelMapper.map(wortkarte, WordResponseDTO.class);

    }

    @Override
    public List<WordResponseDTO> findByLanguageAndTranslateLanguage(String language, String translateLanguage) {
        return wordRepository.findByLanguageAndTranslateLanguage(language, translateLanguage).stream()
                .map(w -> modelMapper.map(w, WordResponseDTO.class))
                .toList();
    }

    @Override
    public Optional<WordResponseDTO> findByWord(String word) {
        return wordRepository.findByWord(word)
                .map(w -> modelMapper.map(w, WordResponseDTO.class));
    }
}