package ru.geekbrains.winter.market.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartDto {
    private List<CartItemDto> items;
    private int totalPrice;

    public List<CartItemDto> getItems() {
        return items;
    }

    public void setItems(List<CartItemDto> items) {
        this.items = items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
