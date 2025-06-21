package BuilderPatternExample;

public class Computer {
 private String CPU, RAM, storage; //Attributes
 
 //private constructor that takes Builder as a parameter
 private Computer(Builder b){
    this.CPU = b.CPU;
    this.RAM = b.RAM;
    this.storage = b.storage;
 }

 public static class Builder { //Static nested Builder class
  private String CPU, RAM, storage;
 
  public Builder(String CPU,String RAM){
    this.CPU = CPU;
    this.RAM = RAM;
  }

  public Builder setStorage(String storage){
    this.storage = storage;
    return this;
  }

  //build() method that returns an instance of computer
  public Computer build(){
    return new Computer(this);
  }
 }

 public void display(){
    System.out.println("CPU: "+CPU);
    System.out.println("RAM: "+RAM);
    System.out.println("Storage: "+(storage != null ? storage : "Not specified"));
 }
}
