package com.company.models;

import java.util.Date;
import java.util.List;

public class Order {
    private static Long id = 0L;
    private Customer customer;
    private List<Package> packages;
    private Date orderedDate;

    public Order(Customer customer, Date orderedDate, List<Package> packages)
    {
        this.id++;
        this.customer = customer;
        this.orderedDate = orderedDate;
        this.packages = packages;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public List<Package> getPackages() {
        return packages;
    }
}
