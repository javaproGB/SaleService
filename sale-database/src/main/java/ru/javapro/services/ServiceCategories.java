package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.repository.CategoriesRepository;

@Component
@RequiredArgsConstructor
public class ServiceCategories {

    private final CategoriesRepository categoriesRepository;
}
