package controllers;

import models.Board;
import models.Straight;
import models.SuiteDeck;

import utils.Card;

public class ColorStraightMoveController extends MoveController {
    private SuiteDeck suiteDeck;

    private Straight straight;

    public ColorStraightMoveController(Board boardGame, SuiteDeck suiteDeck, Straight straigt) {
        super(boardGame);
        assert suiteDeck != null;
        assert straigt != null;
        this.suiteDeck = suiteDeck;
        this.straight = straigt;

    }

    @Override
    public void move() {
        Card card = suiteDeck.unStackCard();
        straight.stack(card);
    }

    @Override
    public Error validate() {
        if (suiteDeck.isEmpty()) {
            return Error.EMPTY;
        }
        Card card = suiteDeck.getTop();
        ValidateMoveToStraight validateMove = new ValidateMoveToStraight(straight);
        return validateMove.validateMove(card);
    }
}
