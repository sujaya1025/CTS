package DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier{
 protected Notifier n;

 public NotifierDecorator(Notifier n){
    this.n = n;
 }

 public void send(String msg){
    n.send(msg);
 }
}
