package de.ait.homework16be.service;

import de.ait.homework16be.repository.GroupRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Service
@Getter
@Setter
public class GroupServiceImpl implements GroupService {

    private  GroupRepository groupRepository;
    private  WordRepository wordRepository;
    private  ModelMapper modelMapper;

    @Override
    public GroupDTO createGroup(GroupDTO groupDTO) {
        Group group = modelMapper.map(groupDTO, Group.class);
        group = groupRepository.save(group);
        return modelMapper.map(group, GroupDTO.class);
    }

    @Override
    public List<GroupDTO> getAllGroups() {
        return groupRepository.findAll().stream()
                .map(group -> modelMapper.map(group, GroupDTO.class))
                .toList();
    }

    @Override
    public GroupDTO addWordToGroup(Long groupId, Long wordId) {
        Group group = groupRepository.findById(groupId).orElseThrow(() -> new RuntimeException("Group not found"));
        Wortkarte word = wordRepository.findById(wordId).orElseThrow(() -> new RuntimeException("Word not found"));
        group.getWords().add(word);
        group = groupRepository.save(group);
        return modelMapper.map(group, GroupDTO.class);
    }
}
