package models;

import utils.Card;
import utils.Stack;

public class StackMoreThan1 extends Stack {
    public void stack(Card[] cards) {
        assert cards != null;
        for (int i = 0; i < cards.length; i++) {
            super.stack(cards[i]);
        }

    }

    public Number getTopNumber() {
        return this.getTop().getNumber();
    }
}
