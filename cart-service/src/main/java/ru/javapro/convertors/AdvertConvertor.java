package ru.javapro.convertors;

import org.springframework.stereotype.Component;
import ru.javapro.models.Advert;
import ru.javapro.models.AdvertDto;

@Component
public class AdvertConvertor {
    public Advert dtoToEntity(AdvertDto advertDto) {
        Advert advert = new Advert();
        //TODO
        return advert;
    }

    public AdvertDto entityToDto (Advert advert) {
        AdvertDto advertDto = new AdvertDto();
        //TODO
        return advertDto;
    }
}
