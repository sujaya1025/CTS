package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator{
    
    public SlackNotifierDecorator(Notifier n){
        super(n);
    }

    public void send(String msg){
        super.send(msg);
        sendSlack(msg);
    }

    private void sendSlack(String msg){
        System.out.println("Sending a Slack message: "+msg);
    } 
}
