package com.company.controllers;

import com.company.models.Locker;
import com.company.models.Order;
import com.company.services.interfaces.IAdminService;

public class AdminController {

    private IAdminService adminService;
    public AdminController(IAdminService adminService)
    {
        this.adminService = adminService;
    }

    public Order ViewLocker(Locker locker)
    {
        return adminService.ViewLocker(locker);
    }

    public void ClearLocker(Locker locker)
    {
        adminService.ClearLocker(locker);
    }
}
