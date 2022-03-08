package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private static Long id = 0L;
    private String name;
    private List<Locker> lockers;

    public Admin(String name)
    {
        this.id++;
        this.name = name;
        this.lockers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Locker> getLockers() {
        return lockers;
    }

    public void setLockers(List<Locker> lockers) {
        this.lockers = lockers;
    }
}
