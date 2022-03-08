package com.company.repositories;

import com.company.enums.Size;
import com.company.exceptions.LockerIsFull;
import com.company.models.Locker;
import com.company.models.Order;
import com.company.models.Package;
import com.company.repositories.interfaces.ILockerRepository;

import java.util.HashMap;
import java.util.List;

public class LockerRepository implements ILockerRepository {

    static HashMap<Size, Integer> sizeSToAvailableSlot = new HashMap<>(); //Size S-SlotPending
    static HashMap<Size, Integer> sizeMToAvailableSlot = new HashMap<>(); //Size S-SlotPending
    static HashMap<Size, Integer> sizeLToAvailableSlot = new HashMap<>(); //Size S-SlotPending
    static HashMap<Size, Integer> sizeXLToAvailableSlot = new HashMap<>(); //Size S-SlotPending
    HashMap<Long, List<Package>> orderIdToPackages = new HashMap<>(); //OrderId-Packages placed by deliveryGuy
    HashMap<Integer, Order> otpToOrder = new HashMap<>();
    HashMap<Long, Order> lockerToOrder = new HashMap<>();
    static {
        sizeSToAvailableSlot.put(Size.S, Size.S.getPackageSize());
        sizeMToAvailableSlot.put(Size.M, Size.M.getPackageSize());
        sizeLToAvailableSlot.put(Size.L, Size.L.getPackageSize());
        sizeXLToAvailableSlot.put(Size.XL, Size.XL.getPackageSize());
    }

    @Override
    public void UpdateAvailableSlot(Order order) throws LockerIsFull {
        int slotRequirement = order.getPackages().size();
        if(slotRequirement < sizeSToAvailableSlot.get(Size.S))
        {
            Locker locker = new Locker(Size.S);
            lockerToOrder.put(locker.getId(), order);
            sizeSToAvailableSlot.put(Size.S, sizeSToAvailableSlot.get(Size.S)-slotRequirement);
            System.out.println(slotRequirement + " slot booked at locker size:" + Size.S);
        }
        else if(slotRequirement < sizeMToAvailableSlot.get(Size.M))
        {
            Locker locker = new Locker(Size.M);
            lockerToOrder.put(locker.getId(), order);
            sizeMToAvailableSlot.put(Size.M, sizeMToAvailableSlot.get(Size.M)-slotRequirement);
            System.out.println(slotRequirement + " slot booked at locker size:" + Size.M);
        }
        else if(slotRequirement < sizeLToAvailableSlot.get(Size.L))
        {
            Locker locker = new Locker(Size.L);
            lockerToOrder.put(locker.getId(), order);
            sizeLToAvailableSlot.put(Size.L, sizeLToAvailableSlot.get(Size.L)-slotRequirement);
            System.out.println(slotRequirement + " slot booked at locker size:" + Size.L);
        }
        else if(slotRequirement < sizeXLToAvailableSlot.get(Size.XL))
        {
            Locker locker = new Locker(Size.XL);
            lockerToOrder.put(locker.getId(), order);
            sizeXLToAvailableSlot.put(Size.XL, sizeXLToAvailableSlot.get(Size.XL)-slotRequirement);
            System.out.println(slotRequirement + " slot booked at locker size:" + Size.XL);
        }
        else {
            throw new LockerIsFull("Locker is full");
        }
    }

    @Override
    public void UpdateOrderIdWithPackages(Order order) {
        orderIdToPackages.put(order.getId(), order.getPackages());
    }

    @Override
    public void MapOTPToOrder(Order order) {
        int otp = order.getCustomer().getOTP();
        otpToOrder.put(otp, order);
    }

    @Override
    public Order fetOrderWithOTP(Integer otp) {
        Order order = otpToOrder.get(otp);
        return order;
    }

    @Override
    public Order fetchOrderWithLocker(Locker locker) {
        Order order = lockerToOrder.get(locker.getId());
        return order;
    }

    @Override
    public void cancelLocker(Locker locker) {
        lockerToOrder.remove(locker.getId());
    }
}
