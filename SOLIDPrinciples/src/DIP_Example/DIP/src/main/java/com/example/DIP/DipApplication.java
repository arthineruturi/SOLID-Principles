package com.example.DIP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.DIP.Controller.NotificationService;

@SpringBootApplication
public class DipApplication {

    public static void main(String[] args) {
        SpringApplication.run(DipApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ApplicationContext context) {
        return args -> {
            NotificationService emailNotification = context.getBean("emailNotificationService", NotificationService.class);
            
             NotificationService smsNotification = context.getBean("smsNotificationService", NotificationService.class);
            emailNotification.notify("This is an email notification.");
            smsNotification.notify("This is an SMS notification.");
        };
    }
}
