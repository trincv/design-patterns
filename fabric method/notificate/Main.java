package notificate;
import notificate.users.EnterpriseUser;
import notificate.users.FreeUser;
import notificate.users.PremiumUser;

public class Main {
    
    public static void main(String[] args) {
        
        FreeUser free1 = new FreeUser("luiz");
        PremiumUser premium1 = new PremiumUser("caio");
        EnterpriseUser enterprise1 = new EnterpriseUser("joao");

        free1.sendNotification();
        premium1.sendNotification();
        enterprise1.sendNotification();
    }
}
