package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy{
 private String email;
 
 public PayPalPayment(String email){
    this.email = email;
 }

 public void pay(double amt){
    System.out.println("Paid Rs "+amt+" using PayPal "+email);
 }
}
