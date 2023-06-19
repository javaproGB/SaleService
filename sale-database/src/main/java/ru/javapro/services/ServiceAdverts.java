package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.javapro.model.Advert;
import ru.javapro.repository.AdvertsRepository;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ServiceAdverts {

    private final AdvertsRepository advertsRepository;

    public List<Advert> findAllAdvertsByUserId(UUID uuid) {
        return advertsRepository.findAllAdvertsByUserId(uuid);
    }
}
