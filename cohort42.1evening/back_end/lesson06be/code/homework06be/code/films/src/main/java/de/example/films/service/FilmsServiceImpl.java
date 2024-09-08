package de.example.films.service;

import de.example.films.entity.Films;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FilmsServiceImpl implements FilmsService {
    @Override
    public List<Films> getAllFilms() {
        return List.of();
    }
}
