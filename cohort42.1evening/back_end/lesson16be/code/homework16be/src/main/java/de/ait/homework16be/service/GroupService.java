package de.ait.homework16be.service;

import de.ait.homework16be.dto.GroupDTO;

import java.util.List;

public interface GroupService {
    GroupDTO createGroup(GroupDTO groupDTO);
    List<GroupDTO> getAllGroups();
    GroupDTO addWordToGroup(Long groupId, Long wordId);
}
