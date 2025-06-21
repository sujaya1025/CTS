package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator{
  
    public SMSNotifierDecorator(Notifier n){
        super(n);
    }

    public void send(String msg){
        super.send(msg);
        sendSMS(msg);
    }

    private void sendSMS(String msg){
        System.out.println("Sending an SMS: "+msg);
    }
}
