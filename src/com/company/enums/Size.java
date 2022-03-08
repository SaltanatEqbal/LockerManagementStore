package com.company.enums;

public enum Size {
    XL(10),
    L(5),
    M(3),
    S(1);

    private int packageSize;
    Size(int packageSize) {
        this.packageSize = packageSize;
    }

    public int getPackageSize() {
        return packageSize;
    }
}
