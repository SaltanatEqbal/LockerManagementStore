package com.company.exceptions;

public class LockerIsFull extends LockerManagementException{
    public LockerIsFull(String message) {
        super(message);
    }
}
