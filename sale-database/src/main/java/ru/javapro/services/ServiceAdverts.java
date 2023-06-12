package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.repository.AdvertsRepository;

@Component
@RequiredArgsConstructor
public class ServiceAdverts {

    private final AdvertsRepository advertsRepository;
}
