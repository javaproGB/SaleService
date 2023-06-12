package ru.javapro.models;

import java.util.List;

public class CartDto {
    private List<AdvertDto> advertList;

    public List<AdvertDto> getAdvertList() {
        return advertList;
    }

    public void setAdvertList(List<AdvertDto> advertList) {
        this.advertList = advertList;
    }
}
