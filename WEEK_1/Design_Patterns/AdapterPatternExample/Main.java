package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(1000.00);

    
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(2000.00);
    }
}
