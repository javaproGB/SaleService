package ru.javapro.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public User getUserById(@PathVariable(name = "uuid") UUID uuid) {
        return serviceUsers.getUserById(uuid);
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
}
