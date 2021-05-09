package UI;

import Client.Balance;
import Client.Card;

public class BalanceUI {
    private int status;
    private Card card = new Card();

    private Balance GetCardBalance() {
        //Balance bal = new Balance();
        return card.getBalance();

        //return  bal;
    }

    public void ShowBalance(){
        //GetCardBalance();
        System.out.println(card.getBalance());
    }
}