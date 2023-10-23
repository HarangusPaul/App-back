package com.example.app.config.enums.urls;

public enum UsersURL {
    USERS("/app/v1/users"),
    GET_USER("/get"),
    ADD_USER("/add");

    UsersURL(String message) {
    }
}
