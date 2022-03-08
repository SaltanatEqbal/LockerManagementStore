package com.company.repositories.interfaces;

import com.company.enums.Size;
import com.company.models.Locker;
import com.company.models.Order;
import com.company.models.Package;

import java.util.HashMap;
import java.util.List;

public interface ILockerRepository {

    void UpdateAvailableSlot(Order order);
    void UpdateOrderIdWithPackages(Order order);
    void MapOTPToOrder(Order order);
    Order fetOrderWithOTP(Integer otp);
    Order fetchOrderWithLocker(Locker locker);
    void cancelLocker(Locker locker);
}
