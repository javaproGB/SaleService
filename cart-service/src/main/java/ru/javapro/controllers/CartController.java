package ru.javapro.controllers;

import org.springframework.web.bind.annotation.*;
import ru.javapro.convertors.AdvertConvertor;
import ru.javapro.convertors.CartConvertor;
import ru.javapro.models.AdvertDto;
import ru.javapro.models.CartDto;
import ru.javapro.services.CartService;

@RestController
@RequestMapping("/api/v1/users")
public class CartController {
    private final CartService cartService;
    private final CartConvertor cartConvertor;
    private final AdvertConvertor advertConvertor;

    public CartController(CartService cartService, CartConvertor cartConvertor, AdvertConvertor advertConvertor) {
        this.cartService = cartService;
        this.cartConvertor = cartConvertor;
        this.advertConvertor = advertConvertor;
    }

    @GetMapping("/{username}/carts")
    public CartDto getCurrentCart(@PathVariable(name = "username") String username) {
        return cartConvertor.entityToDto(cartService.getCurrentCart(username));
    }

    @PostMapping("{username}/carts/add-item")
    public CartDto addAdvertToCart(@PathVariable(name = "username") String username, @RequestBody AdvertDto advertDto) {
        return cartConvertor.entityToDto(cartService.addAdvertToCart(username, advertConvertor.dtoToEntity(advertDto)));

    }

    @PostMapping("/{username}/carts/clear")
    public CartDto clearCart(@PathVariable(name = "username") String username) {
        return cartConvertor.entityToDto(cartService.clearCart(username));

    }

    @PostMapping("/{username}/carts/delete-item")
    public CartDto deleteAdvertFromCart(@PathVariable(name = "username") String username, @RequestBody AdvertDto advertDto) {
        return cartConvertor.entityToDto(cartService.deleteAdvertFromCart(username, advertConvertor.dtoToEntity(advertDto)));
    }
}
