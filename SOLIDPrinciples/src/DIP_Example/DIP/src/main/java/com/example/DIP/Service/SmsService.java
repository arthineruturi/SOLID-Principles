package com.example.DIP.Service;

import com.example.DIP.abstraction.iMessageSender;
import org.springframework.stereotype.Component;

@Component("smsMessageSender") 
public class SmsService implements iMessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
