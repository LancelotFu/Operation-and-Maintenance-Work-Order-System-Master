package com.example.operationmaintenancesystem.entity;

public class approval extends User{
    private int departmentB;

    public approval(int userId, String password, int identityId, int identityNumber, String identityName, int departmentB) {
        super(userId, password, identityId, identityNumber, identityName);
        this.departmentB = departmentB;
    }

    public int getDepartmentB() {
        return departmentB;
    }

    public void setDepartmentB(int departmentB) {
        this.departmentB = departmentB;
    }
}
