package ru.javapro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javapro.model.Category;

import java.util.UUID;

@Repository
public interface CategoriesRepositoryDao extends JpaRepository<Category, UUID> {
}
