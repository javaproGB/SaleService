package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javapro.model.Advert;

import java.util.List;
import java.util.UUID;

@Component
@Scope("prototype")
@RequiredArgsConstructor
public class AdvertsRepository {

    private final AdvertsRepositoryDao advertsRepositoryDao;

    public List<Advert> findAllAdvertsByUserId(UUID uuid) {
        return advertsRepositoryDao.findAllAdvertsByUserId(uuid);
    }
}
