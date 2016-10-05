package models;

import utils.Card;

public class DeckBuilder {
    private Card[] cards;

    public DeckBuilder() {

    }

    public Deck buildDeck() {
        cards = null;
        Card card;
        int i = 0;
        for (Suite suite : Suite.values()) {
            for (Number number : Number.values()) {
                card = new Card(number, suite);
                cards[i] = card;
                i++;
            }
        }
        return new Deck(cards);
    }
}
