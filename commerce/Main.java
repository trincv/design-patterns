package commerce;

import java.util.ArrayList;
import java.util.List;

import commerce.interfaces.IPaymentProcessor;
import commerce.payment.AdapterPayment;
import commerce.payment.PayPalProcessor;
import commerce.payment.StripeyPay;

public class Main {
    
    public static void main(String[] args) {

        List<IPaymentProcessor> payList = new ArrayList<>();
        
        AdapterPayment payment = new AdapterPayment(new StripeyPay());
        PayPalProcessor payPal = new PayPalProcessor();

        payList.add(payPal);
        payList.add(payment);

        for(IPaymentProcessor iPaymentProcessor : payList) {
            iPaymentProcessor.pay(50.0);
        }
    }
}
