import java.util.ArrayList;

public class Portfolio {
    ArrayList<Transaction> transactions = new ArrayList<>();
    double balance = 10000; // starting money

    public void buyStock(String symbol, int qty, double price) {
        double cost = qty * price;

        if (cost > balance) {
            System.out.println("Not enough balance!");
            return;
        }

        balance -= cost;
        transactions.add(new Transaction("BUY", symbol, qty, price));
        System.out.println("Bought " + qty + " shares of " + symbol);
    }

    public void sellStock(String symbol, int qty, double price) {
        balance += qty * price;
        transactions.add(new Transaction("SELL", symbol, qty, price));
        System.out.println("Sold " + qty + " shares of " + symbol);
    }

    public void showPortfolio() {
        System.out.println("\n===== PORTFOLIO REPORT =====");
        System.out.println("Remaining Balance: " + balance);

        for (Transaction t : transactions) {
            System.out.println(t.type + " " + t.stockSymbol +
                    " Qty: " + t.quantity + " Price: " + t.price);
        }
    }
}