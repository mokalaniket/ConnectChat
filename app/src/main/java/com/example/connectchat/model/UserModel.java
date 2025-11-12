package com.example.connectchat.model;

import com.google.firebase.Timestamp;

public class UserModel {
    private String phoneNumber;
    private String username;
    private Timestamp createdTimestamp;
    private String userId;
    private String fcmToken;

    // Empty constructor required for Firestore
    public UserModel() {
    }

    // Constructor with all fields
    public UserModel(String phoneNumber, String username, Timestamp createdTimestamp, String userId) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.createdTimestamp = createdTimestamp;
        this.userId = userId;
    }

    // Getters
    public String getPhone() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public String getUserId() {
        return userId;
    }

    // Setters
    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
