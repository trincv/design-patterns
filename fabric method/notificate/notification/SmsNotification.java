package notificate.notification;

public class SmsNotification extends Notification{

    public void send(String name) {
        System.out.println("Sending sms notification to " + name + "...");
    }
}
