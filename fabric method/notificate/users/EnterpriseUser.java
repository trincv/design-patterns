package notificate.users;

import notificate.notification.Notification;
import notificate.notification.PushNotification;

public class EnterpriseUser extends User{

    public EnterpriseUser(String name) {
        super(name);
    }

    public Notification createNotification() {
        return new PushNotification();
    }
    
}
