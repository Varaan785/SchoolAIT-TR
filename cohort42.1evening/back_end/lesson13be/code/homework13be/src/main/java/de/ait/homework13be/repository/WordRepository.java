package de.ait.homework13be.repository;

import de.ait.homework13be.entity.Wortkarte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<Wortkarte, Long> {

}


