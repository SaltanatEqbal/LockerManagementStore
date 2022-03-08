package com.company.repositories.interfaces;

import com.company.models.Order;

public interface ICustomerRepository {

    void placeOrderWithOrderId(Order order); //OrderIdAndPackages
}
