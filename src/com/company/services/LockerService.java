package com.company.services;

import com.company.enums.Size;
import com.company.models.Locker;
import com.company.models.Order;
import com.company.models.Package;
import com.company.repositories.interfaces.ILockerRepository;
import com.company.services.interfaces.ILockerService;

import java.util.List;

public class LockerService implements ILockerService {

    private ILockerRepository lockerRepository;

    public LockerService(ILockerRepository lockerRepository)
    {
        this.lockerRepository = lockerRepository;
    }

    @Override
    public void PlaceInAvailableLocker(Order order) {
        lockerRepository.UpdateAvailableSlot(order);
        lockerRepository.UpdateOrderIdWithPackages(order);
        System.out.println("Packages placed for Order Id:" + order.getId());
    }

    @Override
    public void MapOTPToOrder(Order order) {
        lockerRepository.MapOTPToOrder(order);
    }

    @Override
    public Order fetchOrderWithLocker(Locker locker) {
        return lockerRepository.fetchOrderWithLocker(locker);
    }

    @Override
    public void cancelLocker(Locker locker) {
        lockerRepository.cancelLocker(locker);
    }
}
