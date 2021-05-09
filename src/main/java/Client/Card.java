package Client;

public class Card {
    private int Type;
    private int Pin;
    private Client.Balance Balance = new Balance();
    private Currency currency = new Currency();

    public int getType() {
        return Type;
    }

    public int getPin() {
        return Pin;
    }

    public Balance getBalance() {
        return this.Balance;
    }

    public Currency getCurrency() {
        return this.currency;
    }
}
