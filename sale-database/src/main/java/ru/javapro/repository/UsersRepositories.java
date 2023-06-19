package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.model.User;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UsersRepositories {

    private final UsersRepositoryDao usersRepositoryDao;

    public User getUserById (UUID uuid) {
        return usersRepositoryDao.getReferenceById(uuid);
    }
}
