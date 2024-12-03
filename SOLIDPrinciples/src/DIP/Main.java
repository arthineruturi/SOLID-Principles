package DIP;


import DIP.abstraction.MessageSender;
import DIP.lowlevel.EmailService;
import DIP.lowlevel.SMSService;
import DIP.lowlevel.PushNotificationService;
import DIP.highlevel.NotificationService;

public class Main {
 public static void main(String[] args) {

     MessageSender emailService = new EmailService();
     MessageSender smsService = new SMSService();
     MessageSender pushService = new PushNotificationService();

  
     NotificationService emailNotification = new NotificationService(emailService);
     NotificationService smsNotification = new NotificationService(smsService);
     NotificationService pushNotification = new NotificationService(pushService);

 
     emailNotification.notify("This is an email notification.");
     smsNotification.notify("This is an SMS notification.");
     pushNotification.notify("This is a push notification.");
 }
}