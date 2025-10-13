package notification.users;

import notification.message.Message;
import notification.message.PushMessage;

public class EnterpriseUser extends User{

    public EnterpriseUser(String name) {
        super(name);
    }

    public Message createNotification() {
        return new PushMessage();
    }
    
}
