package com.example.operationmaintenancesystem.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("ResponseOrder")
public class responseOrder {
    private int responseId;
    private String responseDescription;
    private String responseStatus;
    private int responseUserId;
    private String operatorName;

    public responseOrder() {
    }

    public responseOrder(int responseId, String responseDescription, String responseStatus, int responseUserId, String operatorName) {
        this.responseId = responseId;
        this.responseDescription = responseDescription;
        this.responseStatus = responseStatus;
        this.responseUserId = responseUserId;
        this.operatorName = operatorName;
    }

    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public int getResponseUserId() {
        return responseUserId;
    }

    public void setResponseUserId(int responseUserId) {
        this.responseUserId = responseUserId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
