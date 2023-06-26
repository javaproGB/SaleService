package ru.javapro.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.javapro.model.Advert;
import ru.javapro.model.User;

import java.nio.charset.StandardCharsets;
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

    public void delAdvert(UUID uuid) {
        advertsRepositoryDao.deleteById(uuid);
    }

    @Transactional
    public void addAdvert(User user, String title) {
        Advert advertToAdd = new Advert();

        UUID uuid = UUID.nameUUIDFromBytes(title.getBytes(StandardCharsets.UTF_8));

        advertToAdd.setId(uuid);
        advertToAdd.setUsersAdverts(user);
    }
}
