package controllers;

import models.Board;
import models.Discard;
import models.Straight;
import utils.Card;

public class DiscardStraightMoveController extends MoveController {
    private Discard discard;

    private Straight straight;

    public DiscardStraightMoveController(Board boardGame, Straight straight) {
        super(boardGame);
        this.discard = this.getDiscard();
        this.straight = straight;
    }

    @Override
    public void move() {
        Card card = discard.unStackCard();
        card.setFlip(true);
        straight.stack(card);

    }

    @Override
    public Error validate() {
        if (discard.isEmpty()) {
            return Error.EMPTY;
        }
        Card card = discard.getTop();
        ValidateMoveToStraight validateMove = new ValidateMoveToStraight(straight);
        return validateMove.validateMove(card);
    }

}
