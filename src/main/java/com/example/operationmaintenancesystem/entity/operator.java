package com.example.operationmaintenancesystem.entity;

public class operator extends User{
    private int departmentC;

    public operator(int userId, String password, int identityId, int identityNumber, String identityName, int departmentC) {
        super(userId, password, identityId, identityNumber, identityName);
        this.departmentC = departmentC;
    }

    public int getDepartmentC() {
        return departmentC;
    }

    public void setDepartmentC(int departmentC) {
        this.departmentC = departmentC;
    }
}
