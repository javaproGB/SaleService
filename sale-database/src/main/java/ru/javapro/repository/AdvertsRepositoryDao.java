package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Advert;

import java.util.List;
import java.util.UUID;

@Repository
public interface AdvertsRepositoryDao extends JpaRepository<Advert, UUID> {
    @Query(nativeQuery = true, value = "select * from adverts where user_id = :uuid")
    List<Advert> findAllAdvertsByUserId(UUID uuid);
}
