package com.company.services.interfaces;

import com.company.models.Order;


public interface ICustomerService {
    void PlaceNewOrder(Order order);
    Order PickUpFromLocker(Integer OTP);
    void ReturnPackageToCompany(Order order);
}
