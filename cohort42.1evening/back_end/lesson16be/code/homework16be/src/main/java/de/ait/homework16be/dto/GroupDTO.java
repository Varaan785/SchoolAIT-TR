package de.ait.homework16be.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GroupDTO {

    private Long id;
    private String name;
    private Set<WordResponseDTO> words;
}