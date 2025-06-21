package SingletonPatternExample;

public class Logger{
 
 private static Logger ins;

 private Logger(){
    System.out.println("Logger initialised");
 }

 public static Logger getInstance(){
    if(ins == null){
        ins = new Logger();
    }
    return ins;
 }

 public void log(String msg){
    System.out.println("Log: "+msg);
 }
}