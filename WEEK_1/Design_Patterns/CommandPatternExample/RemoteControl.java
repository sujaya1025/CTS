package CommandPatternExample;

public class RemoteControl {
  private Command c;
  
  public void setCommand(Command c){
    this.c = c;
  }

  public void button(){
    if(c != null) c.execute();
    else System.out.println("No command assigned");
  }
}
