package com.example.operationmaintenancesystem.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("WorkOrder")
public class WorkOrder {
    private int orderId;
    private String issueDescription;
    private int orderStatus;
    private String applicantName;
    private int applicantId;
    private int applicantIdentity;
    private int recipientId;
    private String recipientName;
    private int type;
    private int department;
    private String sendTime;
    private String finishTime;

    private String deadline;

    public WorkOrder() {
    }

    public WorkOrder(int orderId, String issueDescription, int orderStatus, String applicantName, int applicantId, int applicantIdentity, int recipientId, String recipientName, int type, int department, String sendTime, String finishTime, String deadline) {
        this.orderId = orderId;
        this.issueDescription = issueDescription;
        this.orderStatus = orderStatus;
        this.applicantName = applicantName;
        this.applicantId = applicantId;
        this.applicantIdentity = applicantIdentity;
        this.recipientId = recipientId;
        this.recipientName = recipientName;
        this.type = type;
        this.department = department;
        this.sendTime = sendTime;
        this.finishTime = finishTime;
        this.deadline = deadline;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getApplicantIdentity() {
        return applicantIdentity;
    }

    public void setApplicantIdentity(int applicantIdentity) {
        this.applicantIdentity = applicantIdentity;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
