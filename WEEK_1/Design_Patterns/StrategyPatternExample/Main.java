package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876", "Sujaya"));
        context.payAmount(2500.00);

        System.out.println("***********************");

        context.setPaymentStrategy(new PayPalPayment("sujaya@example.com"));
        context.payAmount(1800.50);
    }
}
