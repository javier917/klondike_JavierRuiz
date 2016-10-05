package controllers;

import models.Board;
import models.Deck;
import models.Discard;

public class DiscardDeckMoveController extends MoveController {
    private Deck deck;

    private Discard discard;

    public DiscardDeckMoveController(Board boardGame) {
        super(boardGame);
        deck = this.getDeck();
        discard = this.getDiscard();
    }

    @Override
    public void move() {
        this.deck.stack(this.discard.clean());
    }

    @Override
    public Error validate() {
        if (discard.isEmpty()) {
            return Error.EMPTY;
        } else {
            if (!deck.isEmpty()) {
                return Error.EMPTYDECK;
            }
            return null;
        }
    }
}
