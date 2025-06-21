package SingletonPatternExample;

public class Main {
    
 public static void main(String[] args){
    Logger l1 = Logger.getInstance();
    l1.log("First");

    Logger l2 = Logger.getInstance();
    l2.log("Second");

    if(l1 == l2)
     System.out.println("Singleton Confirmed!");
    else
     System.out.println("Singleton Failed!");
 }
}
