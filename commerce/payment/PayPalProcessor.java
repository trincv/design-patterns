package commerce.payment;

import commerce.interfaces.IPaymentProcessor;

public class PayPalProcessor implements IPaymentProcessor {
    
    @Override
    public void pay(double dollars) {
        System.out.println("PayPal processed direct payment of $" + dollars);
    }
}
