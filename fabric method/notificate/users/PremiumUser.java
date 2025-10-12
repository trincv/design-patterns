package notificate.users;

import notificate.notification.Notification;
import notificate.notification.SmsNotification;

public class PremiumUser extends User{

    public PremiumUser(String name) {
        super(name);
    }

    public Notification createNotification() {
        return new SmsNotification();
    }
    
}
