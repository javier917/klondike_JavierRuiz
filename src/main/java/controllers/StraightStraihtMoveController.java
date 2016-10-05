package controllers;

import models.Board;
import models.Straight;
import utils.Card;

public class StraightStraihtMoveController extends MoveController {
    private Straight straightOrigin;

    private Straight straightDestiny;

    private int numCards;

    public StraightStraihtMoveController(Board boardGame, Straight straightOrigin, Straight straightDestiny) {
        super(boardGame);
        this.straightOrigin = straightOrigin;
        this.straightDestiny = straightDestiny;
    }

    @Override
    public void move() {
        Card[] cards = straightOrigin.unStack(numCards);
        straightOrigin.getTop().setFlip(true);
        straightDestiny.stack(cards);
    }

    @Override
    public Error validate() {
        if (straightOrigin.isEmpty()) {
            return Error.EMPTY;
        }
        Card[] cards = straightOrigin.unStack(numCards);
        ValidateMoveToStraight validateMoveToStraight = new ValidateMoveToStraight(straightDestiny);
        return validateMoveToStraight.validateMove(cards[0]);
    }

    public void setNumCartas(int numCards) {
        this.numCards = numCards;
    }

}
