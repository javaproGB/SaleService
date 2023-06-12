package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@RequiredArgsConstructor
public class RolesRepositories {

    private final RolesRepositoriesDao rolesRepositoriesDao;
}
