package notification.message;

public class EmailMessage extends Message{

    public void send(String name) {
        System.out.println("Sending email notification to " + name + "...");
    }

}
