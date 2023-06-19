package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.model.User;
import ru.javapro.repository.UsersRepositories;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ServiceUsers {

    private final UsersRepositories usersRepositories;

    public User getUserById (UUID uuid) {
        return usersRepositories.getUserById(uuid);
    }
}
