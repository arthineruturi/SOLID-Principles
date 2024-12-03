package com.example.DIP.Controller;

import com.example.DIP.abstraction.iMessageSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final iMessageSender messageSender;
    public NotificationService(iMessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message) {
        messageSender.sendMessage(message);
    }
}
