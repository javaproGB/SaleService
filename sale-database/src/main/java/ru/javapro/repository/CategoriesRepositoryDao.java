package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Categories;

import java.util.UUID;

@Repository
public interface CategoriesRepositoryDao extends JpaRepository<Categories, UUID> {
}
