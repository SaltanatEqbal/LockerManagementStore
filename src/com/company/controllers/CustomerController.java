package com.company.controllers;

import com.company.models.Order;
import com.company.services.CustomerService;
import com.company.services.interfaces.ICustomerService;

public class CustomerController {

    private ICustomerService customerService;
    public CustomerController(ICustomerService customerService)
    {
        this.customerService = customerService;
    }

    public void PlaceNewOrder(Order order)
    {
        customerService.PlaceNewOrder(order);
    }

    public Order PickUpFromLocker(Integer OTP)
    {
        return customerService.PickUpFromLocker(OTP);
    }

    public void ReturnPackageToCompany(Order order)
    {
        customerService.ReturnPackageToCompany(order);
    }
}
