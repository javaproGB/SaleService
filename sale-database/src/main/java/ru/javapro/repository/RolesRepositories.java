package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javapro.model.Role;

import java.util.UUID;

@Component
@Scope("prototype")
@RequiredArgsConstructor
public class RolesRepositories {
    private final RolesRepositoriesDao rolesRepositoriesDao;

    public Role getRoleById (UUID uuid) {
        return rolesRepositoriesDao.getReferenceById(uuid);
    }
}
