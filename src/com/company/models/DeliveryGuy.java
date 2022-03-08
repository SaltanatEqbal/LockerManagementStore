package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class DeliveryGuy {
    private static Long id = 0L;
    private String name;
    private List<Order> orders;

    public DeliveryGuy(String name)
    {
        this.id++;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
