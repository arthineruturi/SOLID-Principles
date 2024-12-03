package com.example.DIP.Service;

import com.example.DIP.abstraction.iMessageSender;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("emailMessageSender")
public class EmailService implements iMessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
