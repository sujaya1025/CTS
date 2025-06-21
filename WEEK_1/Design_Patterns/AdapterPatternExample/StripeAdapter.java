package AdapterPatternExample;

public class StripeAdapter implements PaymentProcessor{
  
    private Stripe s;
    public StripeAdapter(Stripe s){
        this.s = s;
    }

    public void processPayment(double amt){
        s.stripeMethod(amt);
    }
}
