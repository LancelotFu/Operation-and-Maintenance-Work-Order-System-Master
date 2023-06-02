package com.example.operationmaintenancesystem.entity;

public class User {
    private int userId;
    private String password;
    private int identityId;

    private int identityNumber;
    private String identityName;

    public User() {
    }

    public User(int userId, String password, int identityId, int identityNumber, String identityName) {
        this.userId = userId;
        this.password = password;
        this.identityId = identityId;
        this.identityNumber = identityNumber;
        this.identityName = identityName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdentityId() {
        return identityId;
    }

    public void setIdentityId(int identityId) {
        this.identityId = identityId;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

}
