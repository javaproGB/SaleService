package ru.javapro.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.javapro.dto.UserDto;
import ru.javapro.model.Advert;
import ru.javapro.model.Category;
import ru.javapro.model.Role;
import ru.javapro.model.User;
import ru.javapro.services.ServiceAdverts;
import ru.javapro.services.ServiceCategories;
import ru.javapro.services.ServiceRoles;
import ru.javapro.services.ServiceUsers;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("/api/v1/sale")
public class DatabaseController {
    @Autowired
    ServiceUsers serviceUsers;
    @Autowired
    ServiceRoles serviceRoles;
    @Autowired
    ServiceCategories serviceCategories;
    @Autowired
    ServiceAdverts serviceAdverts;


    @GetMapping("user/{uuid}")
    @ResponseBody
    public UserDto getUserById(@PathVariable(name = "uuid") UUID uuid) {
        return serviceUsers.getUserById(uuid);
    }

    @GetMapping("users")
    @ResponseBody
    public List<UserDto> getAllUsers() {
        return serviceUsers.getAllUsers();
    }

    @DeleteMapping("users")
    @ResponseBody
    public void delUser(@RequestParam UUID uuid) {
        serviceUsers.delUser(uuid);
    }

    @PostMapping("users")
    @ResponseBody
    public void addUser(@RequestParam String username, @RequestParam String password) {
        serviceUsers.addUser(username, password);
    }

    @GetMapping("role/{uuid}")
    @ResponseBody
    public Role getRoleById(@PathVariable(name = "uuid") UUID uuid) {
        return serviceRoles.getRoleById(uuid);
    }

    @GetMapping("category/{uuid}")
    @ResponseBody
    public Category getCategoryById(@PathVariable(name = "uuid") UUID uuid) {
        return serviceCategories.getCategoryById(uuid);
    }

    @GetMapping("adverts/{uuid}")
    @ResponseBody
    public List<Advert> findAllAdvertsByUserId(@PathVariable(name = "uuid") UUID uuid) {
        return serviceAdverts.findAllAdvertsByUserId(uuid);
    }

    @DeleteMapping("adverts")
    @ResponseBody
    public void delAdvert(@RequestParam UUID uuid) {
        serviceAdverts.delAdvert(uuid);
    }

    @PostMapping("adverts")
    @ResponseBody
    public void addUser(@RequestParam UUID user, @RequestParam String title) {
        serviceAdverts.addAdvert(user,title);
    }
}
