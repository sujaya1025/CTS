package ProxyPatternExample;

public class Main {
  public static void main(String[] args) {
    Image i1 = new ProxyImage("img1.png");
    Image i2 = new ProxyImage("img2.jpg");

    i1.display();
    System.out.println("*****************");
    i1.display();
    i2.display();
  }
    
}
