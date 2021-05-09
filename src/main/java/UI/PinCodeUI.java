package UI;

import Client.Card;

public class PinCodeUI {
    private int status;
    private boolean result;
    private Card card = new Card();

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}