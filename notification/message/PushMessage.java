package notification.message;

public class PushMessage extends Message{

    public void send(String name) {
        System.out.println("Sending push notification to " + name + "...");
    }
}
