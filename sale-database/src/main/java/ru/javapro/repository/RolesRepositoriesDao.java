package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Role;

import java.util.UUID;

@Repository
public interface RolesRepositoriesDao extends JpaRepository<Role, UUID> {
}
