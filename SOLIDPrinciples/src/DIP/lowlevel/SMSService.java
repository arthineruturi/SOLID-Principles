package DIP.lowlevel;

import DIP.abstraction.MessageSender;

public class SMSService implements MessageSender {
 @Override
 public void sendMessage(String message) {
     System.out.println("SMS sent: " + message);
 }
}