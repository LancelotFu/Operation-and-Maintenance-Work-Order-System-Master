package com.example.operationmaintenancesystem.entity;

public class applicant extends User {
    private int departmentA;

    public applicant(int userId, String password, int identityId, int identityNumber, String identityName, int departmentA) {
        super(userId, password, identityId, identityNumber, identityName);
        this.departmentA = departmentA;
    }

    public int getDepartmentA() {
        return departmentA;
    }

    public void setDepartmentA(int departmentA) {
        this.departmentA = departmentA;
    }
}
