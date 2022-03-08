package com.company.models;

import com.company.enums.Size;

import java.util.Date;

public class Locker {
    private static Long id = 0L;
    private Size size;
    private Order order;
    private Date lockerUseStartDate;

    public Locker(Size size)
    {
        this.id++;
        this.size = size;
        this.lockerUseStartDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getLockerUseStartDate() {
        return lockerUseStartDate;
    }
}
