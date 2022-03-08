package com.company.services.Common;

import java.util.Random;

public class OTPGeneration {
    public static Integer generateOTPForCustomer()
    {
        Random random = new Random();
        Integer otp = random.nextInt(999999);
        return otp;
    }
}
