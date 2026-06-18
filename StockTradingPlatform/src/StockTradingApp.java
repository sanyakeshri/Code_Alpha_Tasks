import java.util.HashMap;
import java.util.Scanner;

public class StockTradingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // MARKET DATA
        HashMap<String, Double> market = new HashMap<>();
        market.put("AAPL", 180.5);
        market.put("TSLA", 250.0);
        market.put("GOOG", 140.0);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        User user = new User(name);

        int choice;

        do {
            System.out.println("\n===== STOCK MARKET MENU =====");
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- MARKET DATA ---");
                    for (String key : market.keySet()) {
                        System.out.println(key + " : " + market.get(key));
                    }
                    break;

                case 2:
                    System.out.print("Enter stock symbol: ");
                    String bSymbol = sc.next();

                    System.out.print("Enter quantity: ");
                    int bQty = sc.nextInt();

                    if (market.containsKey(bSymbol)) {
                        user.portfolio.buyStock(bSymbol, bQty, market.get(bSymbol));
                    } else {
                        System.out.println("Stock not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter stock symbol: ");
                    String sSymbol = sc.next();

                    System.out.print("Enter quantity: ");
                    int sQty = sc.nextInt();

                    if (market.containsKey(sSymbol)) {
                        user.portfolio.sellStock(sSymbol, sQty, market.get(sSymbol));
                    } else {
                        System.out.println("Stock not found!");
                    }
                    break;

                case 4:
                    user.portfolio.showPortfolio();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}