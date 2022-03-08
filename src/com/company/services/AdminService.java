package com.company.services;

import com.company.models.Locker;
import com.company.models.Order;
import com.company.models.Package;
import com.company.services.interfaces.IAdminService;
import com.company.services.interfaces.ILockerService;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class AdminService implements IAdminService {

    private ILockerService lockerService;
    public AdminService(ILockerService lockerService)
    {
        this.lockerService = lockerService;
    }

    @Override
    public Order ViewLocker(Locker locker) {
        return lockerService.fetchOrderWithLocker(locker);
    }

    @Override
    public void ClearLocker(Locker locker) {
        Date currentDate = new Date();
        long daysDiff = currentDate.getTime() - locker.getLockerUseStartDate().getTime();
        if(daysDiff > 3)
        {
            lockerService.cancelLocker(locker);
        }
    }
}
