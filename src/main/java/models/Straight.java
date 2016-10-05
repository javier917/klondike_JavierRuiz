package models;

import utils.Card;

public class Straight extends StackMoreThan1 {

    public Card[] unStack(int numCards) {
        Card[] cards = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            cards[i] = super.unStackCard();
        }
        return cards;
    }

    public Card[] getCards() {
        return this.data;
    }

    public int getNumFlipCards() {
        int flipCards = 0;
        boolean existCardFlips = true;
        for (int i = getCards().length; existCardFlips; i--) {
            if (getCards()[i].isFlip()) {
                flipCards++;
            } else {
                existCardFlips = false;
            }
        }
        return flipCards;
    }

    public int getTopIndex() {
        return this.topIndex;
    }
}
