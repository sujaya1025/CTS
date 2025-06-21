package CommandPatternExample;

public class LightOff implements Command{
  private Light li;
  
  public LightOff(Light li){
    this.li = li;
  }

  public void execute(){
    li.turnOff();
  }  
}
