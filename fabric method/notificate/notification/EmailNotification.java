package notificate.notification;

public class EmailNotification extends Notification{

    public void send(String name) {
        System.out.println("Sending email notification to " + name + "...");
    }

}
