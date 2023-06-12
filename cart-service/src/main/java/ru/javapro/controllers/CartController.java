package ru.javapro.controllers;

import org.springframework.web.bind.annotation.*;
import ru.javapro.models.AdvertDto;
import ru.javapro.models.Cart;
import ru.javapro.services.CartService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/")
    public Cart getCurrentCart(@RequestHeader(name = "username", required = true) String username) {
        return cartService.getCurrentCart(username);
    }
@PostMapping("/add")
    public Cart addAdvertToCart(@RequestHeader(name = "username", required = true) String username, @RequestBody AdvertDto advert) {
        return cartService.addAdvertToCart(username, advert);

    }

    public Cart clearCart(String username) {
        return cartService.clearCart(username);

    }

    public Cart deleteAdvertFromCart(String username, AdvertDto advert) {
        return cartService.deleteAdvertFromCart(username, advert);
    }
}
