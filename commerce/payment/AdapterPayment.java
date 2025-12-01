package commerce.payment;

import commerce.interfaces.IPaymentProcessor;

public class AdapterPayment implements IPaymentProcessor {

    private StripeyPay stripeyPay;

    public AdapterPayment(StripeyPay stripeyPay) {
        this.stripeyPay = stripeyPay;
    }

    public void setStripeyPay(StripeyPay stripeyPay) {
        this.stripeyPay = stripeyPay;
    }

    @Override
    public void pay(double dollars) {
        
        Integer dollarsCents = (int) (dollars * 100);

        this.stripeyPay.makePayment(dollarsCents);
        
    }
    
}
