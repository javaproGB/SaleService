package ru.javapro.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import ru.javapro.models.Advert;
import ru.javapro.models.Cart;

import java.util.function.Consumer;

@Service
public class CartService {
    private final RedisTemplate<String, Object> redisTemplate;

    private final String cartPrefix;

    public CartService(RedisTemplate<String, Object> redisTemplate, @Value("${cart-service.cart-prefix}") String cartPrefix) {
        this.redisTemplate = redisTemplate;
        this.cartPrefix = cartPrefix;
    }

    public Cart getCurrentCart(String username) {
        String targetUsername = cartPrefix + username;
        if (!redisTemplate.hasKey(targetUsername)) {
            redisTemplate.opsForValue().set(targetUsername, new Cart());
        }

        Cart cart = (Cart) redisTemplate.opsForValue().get(targetUsername);
        return cart;

    }

    public Cart addAdvertToCart(String username, Advert advert) {
        return execute(username, cart -> cart.addAdvertToCart(advert));

    }

    public Cart clearCart(String username) {
        return execute(username, cart -> cart.clear());

    }

    public Cart deleteAdvertFromCart(String username, Advert advert) {
        return execute(username, cart -> cart.deleteAdvertFromCart(advert));
    }

    public Cart execute(String username, Consumer<Cart> operation) {
        Cart cart = getCurrentCart(username);
        operation.accept(cart);
        redisTemplate.opsForValue().set(cartPrefix + username, cart);
        return cart;
    }
}
