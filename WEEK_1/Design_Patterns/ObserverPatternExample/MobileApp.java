package ObserverPatternExample;

public class MobileApp implements Observer{
   private String app;
   
   public MobileApp(String app){
    this.app = app;
   }

   public void update(String name, double price){
    System.out.println(app+"-Stock update :"+name+ " is now Rs "+price);
   }
}
