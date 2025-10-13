package notification.users;

import notification.message.Message;

public abstract class User {

    String name;

    public User(String name) {
        this.name = name;
    }
    
    public void sendNotification() {
        Message notify = createNotification();
        notify.send(this.name);
    }

    public abstract Message createNotification();

}
