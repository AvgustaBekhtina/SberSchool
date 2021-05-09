package Client;

import java.math.BigDecimal;

public class Customer {

    private Balance balance = new Balance();
    private Currency currency = new Currency();

    public Balance getBalance() {
        return this.balance;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
