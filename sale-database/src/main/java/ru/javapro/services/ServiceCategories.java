package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.javapro.model.Category;
import ru.javapro.repository.CategoriesRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceCategories {

    private final CategoriesRepository categoriesRepository;

    public Category getCategoryById(UUID uuid) {
        return categoriesRepository.getCategoryById(uuid);
    }
}
