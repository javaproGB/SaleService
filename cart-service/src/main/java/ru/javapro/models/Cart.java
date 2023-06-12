package ru.javapro.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Advert> advertList;

    public Cart() {
        this.advertList = new ArrayList<>();
    }

    public List<Advert> getAdvertList() {
        return advertList;
    }

    public void setAdvertList(List<Advert> advertList) {
        this.advertList = advertList;
    }

    public void addAdvertToCart(Advert advert) {
        advertList.add(advert);
    }

    public void deleteAdvertFromCart(Advert advert) {
        advertList.remove(advert);
    }

    public void clear() {
        advertList = new ArrayList<>();
    }
}
