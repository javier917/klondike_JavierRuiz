package controllers;

import models.Board;
import models.Discard;
import models.SuiteDeck;
import utils.Card;

public class DiscardColorMoveController extends MoveController {
    private SuiteDeck suiteDeck;

    private Discard discard;

    public DiscardColorMoveController(Board boardGame, SuiteDeck suiteDeck) {
        super(boardGame);
        this.suiteDeck = suiteDeck;
        this.discard = this.getDiscard();
    }

    @Override
    public void move() {
        Card card = this.discard.unStackCard();
        this.suiteDeck.stack(card);

    }

    @Override
    public Error validate() {
        if (discard.isEmpty()) {
            return Error.EMPTY;
        }
        Card card = discard.getTop();
        ValidateMoveToSuiteDeck movetosuite = new ValidateMoveToSuiteDeck(suiteDeck);
        return movetosuite.validateMove(card);
    }

}
