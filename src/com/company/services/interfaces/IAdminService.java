package com.company.services.interfaces;

import com.company.models.Locker;
import com.company.models.Order;
import com.company.models.Package;

import java.util.List;

public interface IAdminService {

    Order ViewLocker(Locker locker);
    void ClearLocker(Locker locker);
}
