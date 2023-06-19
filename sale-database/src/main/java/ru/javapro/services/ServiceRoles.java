package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.model.Role;
import ru.javapro.repository.RolesRepositories;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ServiceRoles {

    private final RolesRepositories rolesRepositories;

    public Role getRoleById (UUID uuid) {
        return rolesRepositories.getRoleById(uuid);
    }
}
