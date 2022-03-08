package com.company.controllers;

import com.company.models.Order;
import com.company.services.DeliveryGuyService;
import com.company.services.interfaces.IDeliveryGuyService;

public class DeliveryGuyController {

    private IDeliveryGuyService deliveryGuyService;
    public DeliveryGuyController(IDeliveryGuyService deliveryGuyService)
    {
        this.deliveryGuyService = deliveryGuyService;
    }

    public void KeepOrderAtLocker(Order order)
    {
        deliveryGuyService.KeepOrderAtLocker(order);
    }
}
