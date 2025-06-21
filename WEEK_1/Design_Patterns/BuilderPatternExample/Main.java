package BuilderPatternExample;

public class Main {
public static void main(String[] args) {
 Computer c1 = new Computer.Builder("i5","8GB").build();
 Computer c2 = new Computer.Builder("i7","16GB").setStorage("1TB SSD").build();


 System.out.println("Computer 1 :");
 c1.display();

 System.out.println("Computer 2 :");
 c2.display();
}
}
