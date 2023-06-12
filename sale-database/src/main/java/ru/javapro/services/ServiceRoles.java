package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.repository.RolesRepositories;

@Component
@RequiredArgsConstructor
public class ServiceRoles {

    private final RolesRepositories rolesRepositories;
}
