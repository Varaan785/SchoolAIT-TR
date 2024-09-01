package de.ait.homework16be.repository;

import de.ait.homework16be.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
