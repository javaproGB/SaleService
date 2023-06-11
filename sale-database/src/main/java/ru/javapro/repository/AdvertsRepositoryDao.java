package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Adverts;

import java.util.UUID;

@Repository
public interface AdvertsRepositoryDao extends JpaRepository<Adverts, UUID> {
}
