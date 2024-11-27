package DIP.lowlevel;

import DIP.abstraction.MessageSender;

public class PushNotificationService implements MessageSender {
 @Override
 public void sendMessage(String message) {
     System.out.println("Push notification sent: " + message);
 }
}

