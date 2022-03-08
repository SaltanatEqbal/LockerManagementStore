package com.company.models;

public class Package {
    private static Long id = 0L;
    private String name;
    private String description;

    public Package(String name, String description)
    {
        this.id++;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
