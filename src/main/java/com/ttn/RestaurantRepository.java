package com.ttn;

import java.util.HashMap;
import java.util.Map;

public class RestaurantRepository implements ObjectRepository<Restaurant> {

    private Map<Integer, Restaurant> repository;

    @Override
    public void add(Restaurant restaurant) {
        this.repository = new HashMap<>();
    }
}
