package com.company;

import com.company.controllers.CustomerController;
import com.company.controllers.DeliveryGuyController;
import com.company.models.Customer;
import com.company.models.Order;
import com.company.models.Package;
import com.company.repositories.CustomerRepository;
import com.company.repositories.LockerRepository;
import com.company.repositories.interfaces.ICustomerRepository;
import com.company.repositories.interfaces.ILockerRepository;
import com.company.services.CustomerService;
import com.company.services.DeliveryGuyService;
import com.company.services.LockerService;
import com.company.services.interfaces.ICustomerService;
import com.company.services.interfaces.IDeliveryGuyService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ILockerRepository lockerRepository = new LockerRepository();
        ICustomerRepository customerRepository = new CustomerRepository();
        ICustomerService customerService = new CustomerService(customerRepository, lockerRepository);
        CustomerController customerController = new CustomerController(customerService);

        Package package1 = new Package("Cosmetics","Lipstick");
        Package package2 = new Package("Furniture", "Chair");
        List<Package> packages = new ArrayList<>();
        packages.add(package1);
        packages.add(package2);

        Order order = new Order(new Customer("Ankit"),new Date(), packages);
        customerController.PlaceNewOrder(order);

        IDeliveryGuyService deliveryGuyService = new DeliveryGuyService(new LockerService(lockerRepository));
        DeliveryGuyController deliveryGuyController = new DeliveryGuyController(deliveryGuyService);
        deliveryGuyController.KeepOrderAtLocker(order);

        System.out.println("OTP:" + order.getCustomer().getOTP());

        Order order1 = customerController.PickUpFromLocker(order.getCustomer().getOTP());
        System.out.println("Order Id:" + order1.getId() + "::" + "Customer name:" + order1.getCustomer().getName());
    }
}
