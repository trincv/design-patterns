package notificate.users;

import notificate.notification.Notification;

public abstract class User {

    String name;

    public User(String name) {
        this.name = name;
    }
    
    public void sendNotification() {
        Notification notify = createNotification();
        notify.send(this.name);
    }

    public abstract Notification createNotification();

}
