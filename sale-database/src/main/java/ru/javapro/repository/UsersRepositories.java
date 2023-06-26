package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.model.User;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UsersRepositories {

    private final UsersRepositoryDao usersRepositoryDao;

    public User getUserById(UUID uuid) {
        return usersRepositoryDao.findById(uuid).get();
    }

    public List<User> getAllUsers() {
        return usersRepositoryDao.findAll();
    }

    public void delUser(UUID uuid) {
        usersRepositoryDao.deleteById(uuid);
    }

    public void addUser(String username, String password) {
        User userToAdd = new User();

        UUID uuid = UUID.nameUUIDFromBytes(username.getBytes(StandardCharsets.UTF_8));

        userToAdd.setId(uuid);
        userToAdd.setUsername(username);
        userToAdd.setPassword(password);

        usersRepositoryDao.save(userToAdd);
    }
}
