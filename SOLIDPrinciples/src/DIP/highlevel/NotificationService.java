package DIP.highlevel;
import DIP.abstraction.MessageSender;

public class NotificationService {
 private MessageSender messageSender;

 // Dependency injection via constructor
 public NotificationService(MessageSender messageSender) {
     this.messageSender = messageSender;
 }

 public void notify(String message) {
     messageSender.sendMessage(message);
 }
}