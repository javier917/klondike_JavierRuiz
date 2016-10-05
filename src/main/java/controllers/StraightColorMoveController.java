package controllers;

import models.Board;
import models.Straight;
import models.SuiteDeck;
import utils.Card;

public class StraightColorMoveController extends MoveController {
    private Straight straight;

    private SuiteDeck suiteDeck;

    public StraightColorMoveController(Board boardGame, Straight straight, SuiteDeck suiteDeck) {
        super(boardGame);
        this.suiteDeck = suiteDeck;
        this.straight = straight;
    }

    @Override
    public void move() {
        Card card = straight.unStackCard();
        straight.getTop().setFlip(true);
        suiteDeck.stack(card);

    }

    @Override
    public Error validate() {
        if (straight.isEmpty()) {
            return Error.EMPTY;
        }
        Card card = straight.getTop();
        ValidateMoveToSuiteDeck movetosuite = new ValidateMoveToSuiteDeck(suiteDeck);
        return movetosuite.validateMove(card);
    }

}
