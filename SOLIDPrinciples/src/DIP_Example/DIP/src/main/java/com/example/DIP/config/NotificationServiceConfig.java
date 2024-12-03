package com.example.DIP.config;

import com.example.DIP.Controller.NotificationService;
import com.example.DIP.Service.EmailService;
import com.example.DIP.Service.SmsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationServiceConfig {

    @Bean(name = "emailNotificationService")
    public NotificationService emailNotificationService(EmailService emailService) {
        return new NotificationService(emailService);
    }

    @Bean(name = "smsNotificationService")
    public NotificationService smsNotificationService(SmsService smsService) {
        return new NotificationService(smsService);
    }
}
