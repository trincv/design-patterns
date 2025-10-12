package notificate.users;

import notificate.notification.EmailNotification;
import notificate.notification.Notification;

public class FreeUser extends User{

    public FreeUser(String name) {
        super(name);
    }
    
    public Notification createNotification() {
        return new EmailNotification();
    }
}
