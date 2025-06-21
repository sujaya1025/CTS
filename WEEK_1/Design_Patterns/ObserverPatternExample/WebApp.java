package ObserverPatternExample;

public class WebApp implements Observer{
   private String app;
   
   public WebApp(String app){
    this.app = app;
   }

   public void update(String name, double price){
    System.out.println(app+"-Stock update :"+name+ " is now Rs "+price);
   }
}
