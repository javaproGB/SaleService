package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Roles;

import java.util.UUID;

@Repository
public interface RolesRepositoriesDao extends JpaRepository<Roles, UUID> {
}
