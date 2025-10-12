package notificate.notification;

public class PushNotification extends Notification{

    public void send(String name) {
        System.out.println("Sending push notification to " + name + "...");
    }
}
