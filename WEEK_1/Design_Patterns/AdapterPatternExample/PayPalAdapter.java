package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor{
   private PayPal pp;
   
   public PayPalAdapter(PayPal pp){
    this.pp = pp;
   }

   public void processPayment(double amt){
    pp.paypalMethod(amt);
   }
}
