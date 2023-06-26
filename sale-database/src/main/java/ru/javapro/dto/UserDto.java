package ru.javapro.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.javapro.model.Role;
import ru.javapro.model.User;

import java.util.Collection;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private UUID id;
    private String username;
    private String email;
    private String address;
    Collection<Role> roles;

    public UserDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.address = user.getAddress();
        this.roles = user.getRoles();
    }

    public UserDto(UUID id, String username, String email, String address, Collection<Role> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.address = address;
        this.roles = roles;
    }

}
