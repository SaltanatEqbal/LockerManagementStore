package com.company.services;

import com.company.models.Customer;
import com.company.models.Order;
import com.company.services.Common.OTPGeneration;
import com.company.services.interfaces.IDeliveryGuyService;

public class DeliveryGuyService implements IDeliveryGuyService {

    private LockerService lockerService;
    public DeliveryGuyService(LockerService lockerService)
    {
        this.lockerService = lockerService;
    }

    @Override
    public void KeepOrderAtLocker(Order order) {
        lockerService.PlaceInAvailableLocker(order);
        int otp = OTPGeneration.generateOTPForCustomer();
        order.getCustomer().setOTP(otp);
        lockerService.MapOTPToOrder(order);
        System.out.println("Order kept at locker");
    }
}
