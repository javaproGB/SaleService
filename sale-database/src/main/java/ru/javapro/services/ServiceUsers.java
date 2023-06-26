package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.javapro.dto.UserDto;
import ru.javapro.dto.UserDtoMapper;
import ru.javapro.repository.UsersRepositories;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ServiceUsers {

    private final UsersRepositories usersRepositories;
    private final UserDtoMapper userDtoMapper;

    public UserDto getUserById(UUID uuid) {
        return new UserDto(usersRepositories.getUserById(uuid));
    }

    public List<UserDto> getAllUsers() {
        return usersRepositories.getAllUsers()
                .stream()
                .map(userDtoMapper)
                .collect(Collectors.toList());
    }

    public void delUser(UUID uuid) {
        usersRepositories.delUser(uuid);
    }

    public void addUser(String username, String password) {
        usersRepositories.addUser(username, password);
    }
}
