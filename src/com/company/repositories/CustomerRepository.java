package com.company.repositories;

import com.company.models.Customer;
import com.company.models.Order;
import com.company.models.Package;
import com.company.repositories.interfaces.ICustomerRepository;

import java.util.HashMap;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    HashMap<Long, List<Package>> orderIdToPackages = new HashMap<>(); //OrderId - Packages for new order

    @Override
    public void placeOrderWithOrderId(Order order) {
        orderIdToPackages.put(order.getId(), order.getPackages());
    }
}
