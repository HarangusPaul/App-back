package com.example.app.config.enums;

public enum Email {
    EMAIL("s");

    private final String message;
    Email(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
