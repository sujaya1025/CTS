package CommandPatternExample;

public class Main {
 public static void main(String[] args) {
    Light li = new Light();

    Command on = new LightOn(li);
    Command off = new LightOff(li);

    RemoteControl rc = new RemoteControl();

    rc.setCommand(on);
    rc.button();

    rc.setCommand(off);
    rc.button();
 }   
}
