package com.company.services.interfaces;

import com.company.models.Locker;
import com.company.models.Order;

public interface ILockerService {

    void PlaceInAvailableLocker(Order order);
    void MapOTPToOrder(Order order);
    Order fetchOrderWithLocker(Locker locker);
    void cancelLocker(Locker locker);
}
