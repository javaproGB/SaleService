package ru.javapro.convertors;

import org.springframework.stereotype.Component;
import ru.javapro.models.Cart;
import ru.javapro.models.CartDto;

import java.util.stream.Collectors;
@Component
public class CartConvertor {
    private final AdvertConvertor advertConvertor;

    public CartConvertor(AdvertConvertor advertConvertor) {
        this.advertConvertor = advertConvertor;
    }

    public Cart dtoToEntity(CartDto cartDto) {
        Cart cart = new Cart();
        cart.setAdvertList(cartDto.getAdvertList().stream().map(advertConvertor::dtoToEntity).collect(Collectors.toList()));
        return cart;
    }

    public CartDto entityToDto(Cart cart) {
        CartDto cartDto = new CartDto();
        cartDto.setAdvertList(cart.getAdvertList().stream().map(advertConvertor::entityToDto).collect(Collectors.toList()));
        return cartDto;
    }
}
