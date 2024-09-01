package de.ait.homework16be.controller;

import de.ait.homework16be.dto.GroupDTO;
import de.ait.homework16be.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupService groupService;

    @PostMapping
    public GroupDTO createGroup(@RequestBody GroupDTO groupDTO) {
        return groupService.createGroup(groupDTO);
    }

    @GetMapping
    public List<GroupDTO> getAllGroups() {
        return groupService.getAllGroups();
    }

    @PostMapping("/{groupId}/words/{wordId}")
    public GroupDTO addWordToGroup(@PathVariable Long groupId, @PathVariable Long wordId) {
        return groupService.addWordToGroup(groupId, wordId);
    }
}
