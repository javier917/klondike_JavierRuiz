package models;

import utils.Card;

public class Deck extends StackMoreThan1 {
    private static final int SHOW = 3;

    public Deck() {
        super();
    }

    public Deck(Card[] cards) {
        super();
        this.data = cards;
        this.topIndex = cards.length;
        this.shuffle();
    }

    @Override
    public void stack(Card[] cards) {
        assert this.isEmpty();
        super.stack(cards);

    }

    public Card[] unStack() {
        return giveCards(SHOW);
    }

    public Card[] giveCards(int numCards) {
        Card[] cards = new Card[numCards];
        for (int i = 0; (i < numCards) && (!super.isEmpty()); i++) {
            cards[i] = super.unStackCard();
        }
        return cards;
    }

    private void shuffle() {
        assert !isEmpty();
        for (int i = 0; i <= 100; i++) {
            int cardToChanged = (int) (Math.random() * this.MAXSTACK);
            Card aux = this.data[cardToChanged];
            int cardInterchanged = (int) (Math.random() * this.MAXSTACK);
            this.data[cardToChanged] = this.data[cardInterchanged];
            this.data[cardInterchanged] = aux;

        }
    }
}
