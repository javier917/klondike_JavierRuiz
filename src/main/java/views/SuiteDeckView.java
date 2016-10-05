package views;

import models.SuiteDeck;

public class SuiteDeckView extends SingleCardView {
    private SuiteDeck suiteDeck;

    public SuiteDeckView(SuiteDeck suiteDeck) {
        super();
        this.suiteDeck = suiteDeck;
    }

    public void write() {
        super.write(suiteDeck);
    }

    @Override
    public String typeSingleDeck() {
        return "Palo " + suiteDeck.getColor() + ": ";
    }

}
