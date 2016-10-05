package models;

import java.util.List;

public class Board {
    private State state;

    private List<Straight> straights;

    private Deck deck;

    private Discard discard;

    private List<SuiteDeck> suiteDecks;

    public Board() {
        this.state = State.IN_GAME;
        BoardBuilder builder = new BoardBuilder();
        this.deck = builder.buildDeck();
        this.discard = new Discard();
        this.straights = builder.buildStraights();
        this.suiteDecks = builder.buildSuiteDeck();
    }

    public List<Straight> getStraights() {
        return straights;
    }

    public Deck getDeck() {
        return deck;
    }

    public Discard getDiscard() {
        return discard;
    }

    public List<SuiteDeck> getSuiteDecks() {
        return suiteDecks;
    }

    public boolean win() {
        boolean win = true;
        for (SuiteDeck suiteDeck : this.suiteDecks) {
            if (suiteDeck.getTopNumber() != Number.K) {
                win = false;
            }
            this.state = State.FINISH;
        }
        return win;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
