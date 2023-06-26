package ru.javapro.dto;

import org.springframework.stereotype.Service;
import ru.javapro.model.User;

import java.util.function.Function;

@Service
public class UserDtoMapper implements Function<User,UserDto> {
    @Override
    public UserDto apply(User user) {
        return new UserDto(user);
    }
}
