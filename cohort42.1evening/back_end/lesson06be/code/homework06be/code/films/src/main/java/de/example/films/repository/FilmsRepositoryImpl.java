package de.example.films.repository;

import de.example.films.entity.Films;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmsRepositoryImpl implements FilmsRepository {


    private List<Films> list = List.of(
            new Films("Action/Sci-Fi ", "Final Fantasy VII: Advent Children"),
            new Films("Action/Krieg", "Tränen der Sonne"),
            new Films("Action/Abenteuer", "Hero"),
            new Films("Action/Abenteuer ", "Der letzte Mohikaner"),
            new Films("Kinderfilm/Fantasy", "Das letzte Einhorn"),
            new Films("Fantasy/Sci-Fi", "Der Dunkle Turm"),
            new Films("Action/Thriller", "John Wick"),
            new Films("Horror/Fantasy", "Constantine"),
            new Films("Action/Sci-Fi", "Matrix"),
            new Films("Action/Sci-Fi", "Waterworld")


    );

    @Override
    public List<Films> findAllFilms() {
        return list;
    }
}
