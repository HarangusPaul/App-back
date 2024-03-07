package com.example.app.service.Email;

public interface EmailService {
    public void sendSimpleMessage(
            String to, String subject, String text);
}
