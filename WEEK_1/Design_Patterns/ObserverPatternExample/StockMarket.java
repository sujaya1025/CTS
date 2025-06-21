package ObserverPatternExample;
import java.util.*;

public class StockMarket implements Stock{
 private List<Observer> observers = new ArrayList<>();
 private String name;
 private double price;

 public void setStock(String name, double price){
    this.name = name;
    this.price = price;
    notifyObservers();
 }

 public void registerObserver(Observer o){
    observers.add(o);
 }

 public void removeObserver(Observer o){
    observers.remove(o);
 }

 public void notifyObservers(){
    for(Observer o : observers)
      o.update(name,price);
 }
}
