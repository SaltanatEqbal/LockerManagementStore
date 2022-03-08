package com.company.services;

import com.company.models.Customer;
import com.company.models.Order;
import com.company.repositories.interfaces.ICustomerRepository;
import com.company.repositories.interfaces.ILockerRepository;
import com.company.services.Common.OTPGeneration;
import com.company.services.interfaces.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {

    private ICustomerRepository customerRepository;
    private ILockerRepository lockerRepository;
    public CustomerService(ICustomerRepository customerRepository, ILockerRepository lockerRepository)
    {
        this.customerRepository = customerRepository;
        this.lockerRepository = lockerRepository;
    }

    @Override
    public void PlaceNewOrder(Order order) {
        customerRepository.placeOrderWithOrderId(order);
    }

    @Override
    public Order PickUpFromLocker(Integer otp) {
        Order order = lockerRepository.fetOrderWithOTP(otp);
        return order;
    }

    @Override
    public void ReturnPackageToCompany(Order order) {
        int otp = OTPGeneration.generateOTPForCustomer();
        order.getCustomer().setOTP(otp);
    }
}
