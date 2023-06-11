package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Users;

import java.util.UUID;

@Repository
public interface UsersRepositoryDao extends JpaRepository<Users, UUID> {
}
