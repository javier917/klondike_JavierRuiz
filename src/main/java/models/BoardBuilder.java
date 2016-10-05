package models;

import java.util.ArrayList;
import java.util.List;

import utils.Card;

public class BoardBuilder {
    private Deck deck;

    public BoardBuilder() {

    }

    public Deck buildDeck() {
        Deck deck = new Deck();
        Card[] cards = new Card[deck.MAXSTACK];
        Card card;
        int i = 0;
        for (Suite suite : Suite.values()) {
            for (Number number : Number.values()) {
                card = new Card(number, suite);
                cards[i] = card;
                i++;
            }
        }
        this.deck = new Deck(cards);
        return this.deck;
    }

    public List<Straight> buildStraights() {
        List<Straight> straights = new ArrayList<Straight>();
        for (int i = 0; i < 7; i++) {
            Straight straight = new Straight();
            straight.stack(deck.giveCards(i + 1));
            straight.getTop().setFlip(true);
            straights.add(straight);
        }
        return straights;
    }

    public List<SuiteDeck> buildSuiteDeck() {
        List<SuiteDeck> suiteDecks = new ArrayList<SuiteDeck>();
        for (Color color : Color.values()) {
            SuiteDeck suiteDeck = new SuiteDeck(color);
            suiteDecks.add(suiteDeck);
        }
        return suiteDecks;
    }
}
