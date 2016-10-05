package controllers;

import models.Board;
import models.Deck;
import models.Discard;
import utils.Card;

public class DeckDiscardMoveController extends MoveController {
    private Deck deck;

    private Discard discard;

    public DeckDiscardMoveController(Board boardGame) {
        super(boardGame);
        deck = this.getDeck();
        discard = this.getDiscard();
    }

    @Override
    public void move() {
        Card[] cards = this.deck.unStack();
        this.discard.stack(cards);
    }

    @Override
    public Error validate() {
        if (deck.isEmpty()) {
            return Error.EMPTY;
        } else {
            return null;
        }
    }

}
