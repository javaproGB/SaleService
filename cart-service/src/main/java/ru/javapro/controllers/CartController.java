package ru.javapro.controllers;

import org.springframework.web.bind.annotation.*;
import ru.javapro.convertors.AdvertConvertor;
import ru.javapro.convertors.CartConvertor;
import ru.javapro.models.AdvertDto;
import ru.javapro.models.CartDto;
import ru.javapro.services.CartService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
    private final CartService cartService;
    private final CartConvertor cartConvertor;
    private final AdvertConvertor advertConvertor;

    public CartController(CartService cartService, CartConvertor cartConvertor, AdvertConvertor advertConvertor) {
        this.cartService = cartService;
        this.cartConvertor = cartConvertor;
        this.advertConvertor = advertConvertor;
    }
    @GetMapping("/")
    public CartDto getCurrentCart(@RequestHeader(name = "username") String username) {
        return cartConvertor.entityToDto(cartService.getCurrentCart(username));
    }
@PostMapping("/add")
    public CartDto addAdvertToCart(@RequestHeader(name = "username") String username, @RequestBody AdvertDto advertDto) {
        return cartConvertor.entityToDto(cartService.addAdvertToCart(username, advertConvertor.dtoToEntity(advertDto)));

    }
@PostMapping("/clear")
    public CartDto clearCart(@RequestHeader(name = "username") String username) {
        return cartConvertor.entityToDto(cartService.clearCart(username));

    }
    @PostMapping("/delete")
    public CartDto deleteAdvertFromCart(@RequestHeader(name = "username") String username, @RequestBody AdvertDto advertDto) {
        return cartConvertor.entityToDto(cartService.deleteAdvertFromCart(username, advertConvertor.dtoToEntity(advertDto)));
    }
}
