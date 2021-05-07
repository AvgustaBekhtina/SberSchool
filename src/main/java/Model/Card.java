package Model;

public class Card {
    private int Type;
    private int Pin;
    private balance Balance = new balance();
    private currency Currency = new currency();

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }

    public balance getBalance() {
        return this.Balance;
    }
}
