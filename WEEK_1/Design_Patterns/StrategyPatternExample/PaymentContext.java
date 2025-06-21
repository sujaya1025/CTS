package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payAmount(double amt) {
        if(strategy == null){
            System.out.println("No payment strategy selected.");
        } 
        else{
            strategy.pay(amt);
        }
    }
}
