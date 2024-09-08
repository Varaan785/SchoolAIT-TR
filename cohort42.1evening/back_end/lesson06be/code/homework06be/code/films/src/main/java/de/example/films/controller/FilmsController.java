package de.example.films.controller;


import de.example.films.entity.Films;
import de.example.films.service.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmsController {
    private  FilmsService filmsService;
@Autowired
    public FilmsController(FilmsService filmsService) {
        this.filmsService = filmsService;

    }
    @GetMapping("/films")
    public List<Films> getAllFilms() {
    return filmsService.getAllFilms();
    }

}
