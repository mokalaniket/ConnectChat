package com.example.connectchat.model;

import com.google.firebase.Timestamp;
import java.util.List;

public class ChatroomModel {
    private String chatroomId;
    private List<String> userIds;
    private Timestamp lastMessageTimestamp;
    private String lastMessageSenderId;
    private String lastMessage;

    // Empty constructor required for Firestore
    public ChatroomModel() {
    }

    // 5-parameter constructor
    public ChatroomModel(String chatroomId, List<String> userIds,
                         Timestamp lastMessageTimestamp, String lastMessageSenderId,
                         String lastMessage) {
        this.chatroomId = chatroomId;
        this.userIds = userIds;   // fixed
        this.lastMessageTimestamp = lastMessageTimestamp;
        this.lastMessageSenderId = lastMessageSenderId;
        this.lastMessage = lastMessage;
    }

    // 4-parameter constructor (lastMessageSenderId defaults empty)
    public ChatroomModel(String chatroomId, List<String> userIds,
                         Timestamp lastMessageTimestamp, String lastMessage) {
        this.chatroomId = chatroomId;
        this.userIds = userIds;
        this.lastMessageTimestamp = lastMessageTimestamp;
        this.lastMessage = lastMessage;
        this.lastMessageSenderId = ""; //  default empty
    }

    // Getters and setters
    public String getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(String chatroomId) {
        this.chatroomId = chatroomId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public Timestamp getLastMessageTimestamp() {
        return lastMessageTimestamp;
    }

    public void setLastMessageTimestamp(Timestamp lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    public String getLastMessageSenderId() {
        return lastMessageSenderId;
    }

    public void setLastMessageSenderId(String lastMessageSenderId) {
        this.lastMessageSenderId = lastMessageSenderId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
