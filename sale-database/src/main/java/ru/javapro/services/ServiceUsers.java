package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.repository.UsersRepositories;

@Component
@RequiredArgsConstructor
public class ServiceUsers {

    private final UsersRepositories usersRepositories;
}
