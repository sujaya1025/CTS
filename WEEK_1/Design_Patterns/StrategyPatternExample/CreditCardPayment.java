package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
  private String num, name;
  
  public CreditCardPayment(String num,String name){
    this.num = num;
    this.name = name;
  }

  public void pay(double amt){
    System.out.println("Paid Rs "+amt+" using Credit card "+num+" "+name);
  }
}
