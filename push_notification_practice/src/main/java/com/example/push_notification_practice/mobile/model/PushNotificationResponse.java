package com.example.push_notification_practice.mobile.model;

/**
 * @author: Nazim Uddin Asif
 * @version: 1.0
 */
public class PushNotificationResponse {
    private int status;
    private String message;


    public PushNotificationResponse() {
    }
    public PushNotificationResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
