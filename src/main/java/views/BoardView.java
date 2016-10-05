package views;

import java.util.List;

import controllers.Controller;
import models.Straight;
import models.SuiteDeck;

public class BoardView {
    private Controller controller;

    public BoardView(Controller controller) {
        this.controller = controller;
    }

    public void write() {
        DeckView deckView = new DeckView();
        deckView.write(controller.getDeck());
        DiscardView discardView = new DiscardView(controller.getDiscard());
        discardView.write();
        List<SuiteDeck> suiteDecks = controller.getSuiteDecks();
        for (int i = 0; i < suiteDecks.size(); i++) {
            SuiteDeckView suiteDeckView = new SuiteDeckView(suiteDecks.get(i));
            suiteDeckView.write();
        }
        List<Straight> straights = controller.getStraights();
        StraightView straightView = new StraightView();
        for (int i = 0; i < straights.size(); i++) {
            straightView.write(straights.get(i), i);
        }
    }
}
