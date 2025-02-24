package edu.neu.csye7374;

public class PlayStockMarket {
  public static void simulateMarket() {
    StockMarket market = StockMarket.getInstance();
    StockA tesla = new StockA("TSLA", 600.00, "Tesla Stock");
    StockB apple = new StockB("Apple", 100.00, "Apple Stock");

    String[] teslaBids = {"600.00", "590.00", "-610.00", "-614.00", "600.00", "-650.00"};
    String[] appleBids = {"105.00", "-95.00", "-110.00", "90.00", "115.00", "100.00"};

    System.out.println("\nTesla Market Trends:");
    System.out.println("Initial Value " + tesla);
    for (String bid : teslaBids) {
      tesla.setBid(bid);
      market.addBid("tesla: " + bid);
      System.out.println("Bid: " + bid);
      System.out.println("Price Post BID: " + tesla);
      System.out.println("Matrix: " + tesla.getMetric());
    }

    System.out.println("\nApple Market Trends:");
    System.out.println("Initial Value " + apple);
    
    for (String bid : appleBids) {
      apple.setBid(bid);
      market.addBid("apple: " + bid);
      System.out.println("Bid: " + bid);
      System.out.println("Price Post BID: " + apple);
      System.out.println("Matrix: " + apple.getMetric());
    }

    System.out.println("\nBid History:");
    System.out.println(market.getBidHistory());
  }
}