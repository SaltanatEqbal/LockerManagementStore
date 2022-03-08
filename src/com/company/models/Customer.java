package com.company.models;

public class Customer {
    private static Long id = 0L;
    private String name;
    private Integer OTP;

    public Customer(String name)
    {
        this.id++;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getOTP() {
        return OTP;
    }

    public void setOTP(Integer OTP) {
        this.OTP = OTP;
    }
}
