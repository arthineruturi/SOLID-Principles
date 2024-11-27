package DIP.lowlevel;

import DIP.abstraction.MessageSender;

public class EmailService implements MessageSender {
 @Override
 public void sendMessage(String message) {
     System.out.println("Email sent: " + message);
 }
}
