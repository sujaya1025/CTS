package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("PhoneTracker");
        Observer web = new WebApp("BrowserDashboard");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStock("INFY", 1525.00);
        System.out.println("--------------------");

        market.setStock("TCS", 3360.75);
        System.out.println("--------------------");

        market.removeObserver(web);
        market.setStock("WIPRO", 412.10);
    }
}
