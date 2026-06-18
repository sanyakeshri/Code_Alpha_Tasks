public class Transaction {
    String type; // BUY or SELL
    String stockSymbol;
    int quantity;
    double price;

    public Transaction(String type, String stockSymbol, int quantity, double price) {
        this.type = type;
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
    }
}