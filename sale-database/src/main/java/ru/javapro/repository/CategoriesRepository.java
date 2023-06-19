package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javapro.model.Category;

import java.util.UUID;

@Component
@Scope("prototype")
@RequiredArgsConstructor
public class CategoriesRepository {

    private final CategoriesRepositoryDao categoriesRepositoryDao;

    public Category getCategoryById (UUID uuid) {
        return categoriesRepositoryDao.getReferenceById(uuid);
    }
}
