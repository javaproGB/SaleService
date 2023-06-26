package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.javapro.model.Role;
import ru.javapro.repository.RolesRepositories;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceRoles {

    private final RolesRepositories rolesRepositories;

    public Role getRoleById(UUID uuid) {
        return rolesRepositories.getRoleById(uuid);
    }
}
