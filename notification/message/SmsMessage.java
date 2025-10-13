package notification.message;

public class SmsMessage extends Message{

    public void send(String name) {
        System.out.println("Sending sms notification to " + name + "...");
    }
}
