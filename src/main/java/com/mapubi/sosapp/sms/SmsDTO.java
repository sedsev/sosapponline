package com.mapubi.sosapp.sms;

public class SmsDTO {
    private String message;
    private String phoneNumber;

    public SmsDTO() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "SmsDTO{message=\'" + this.message + '\'' + ", phoneNumber=\'" + this.phoneNumber + '\'' + '}';
    }
}
