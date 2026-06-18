public class User {
    String name;
    Portfolio portfolio;

    public User(String name) {
        this.name = name;
        this.portfolio = new Portfolio();
    }
}