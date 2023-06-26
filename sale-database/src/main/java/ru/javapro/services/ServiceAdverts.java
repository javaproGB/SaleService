package ru.javapro.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.javapro.model.Advert;
import ru.javapro.model.User;
import ru.javapro.repository.AdvertsRepository;
import ru.javapro.repository.UsersRepositories;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceAdverts {

    private final AdvertsRepository advertsRepository;

    private final UsersRepositories usersRepositories;

    public List<Advert> findAllAdvertsByUserId(UUID uuid) {
        return advertsRepository.findAllAdvertsByUserId(uuid);
    }

    public void delAdvert(UUID uuid) {
        advertsRepository.delAdvert(uuid);
    }

    public void addAdvert(UUID user, String title) {
        User userToApply = usersRepositories.getUserById(user);
        advertsRepository.addAdvert(userToApply, title);
    }
}
