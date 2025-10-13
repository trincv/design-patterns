package notification.users;

import notification.message.Message;
import notification.message.SmsMessage;

public class PremiumUser extends User{

    public PremiumUser(String name) {
        super(name);
    }

    public Message createNotification() {
        return new SmsMessage();
    }
    
}
