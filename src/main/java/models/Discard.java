package models;

import utils.Card;

public class Discard extends StackMoreThan1 {
    private static final int MAX_CARDS_ACCEPT = 3;

    public Discard() {
        super();
    }

    public void stack(Card[] cards) {
        assert cards != null;
        assert cards.length <= MAX_CARDS_ACCEPT;
        super.stack(cards);
    }

    public Card[] clean() {
        Card[] card = new Card[this.topIndex];
        int i = 0;
        while (!this.isEmpty()) {
            card[i] = super.unStackCard();
            i++;
        }
        return card;
    }

}
