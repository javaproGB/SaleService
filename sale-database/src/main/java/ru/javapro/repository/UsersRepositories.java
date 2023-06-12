package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsersRepositories {

    private final UsersRepositoryDao usersRepositoryDao;
}
