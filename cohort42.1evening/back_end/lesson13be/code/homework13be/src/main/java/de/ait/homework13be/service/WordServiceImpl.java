package de.ait.homework13be.service;

import de.ait.homework13be.dto.WordRequestDTO;
import de.ait.homework13be.dto.WordResponseDTO;
import de.ait.homework13be.entity.Wortkarte;
import de.ait.homework13be.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


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
}