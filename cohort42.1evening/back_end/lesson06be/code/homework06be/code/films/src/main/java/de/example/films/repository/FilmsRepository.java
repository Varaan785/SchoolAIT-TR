package de.example.films.repository;

import de.example.films.entity.Films;

import java.util.List;

public interface FilmsRepository {
    public List<Films> findAllFilms();
}
