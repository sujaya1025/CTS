package CommandPatternExample;

public class LightOn implements Command{
  private Light li;
  
  public LightOn(Light li){
    this.li = li;
  }

  public void execute(){
    li.turnOn();
  }
}
