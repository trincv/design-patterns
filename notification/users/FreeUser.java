package notification.users;

import notification.message.EmailMessage;
import notification.message.Message;

public class FreeUser extends User{

    public FreeUser(String name) {
        super(name);
    }
    
    public Message createNotification() {
        return new EmailMessage();
    }
}
