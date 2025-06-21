package DecoratorPatternExample;

public class Main {
  public static void main(String[] args) {
    Notifier n = new EmailNotifier();
    Notifier sms = new SMSNotifierDecorator(n);
    Notifier slack = new SlackNotifierDecorator(sms);

    System.out.println("Sending notification through Email + SMS + Slack:");
    slack.send("App installation successful");
  }  
}
