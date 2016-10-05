package controllers;

import models.Straight;
import utils.Card;

public class ValidateMoveToStraight extends ValidateMove {
    private Straight straight;

    public ValidateMoveToStraight(Straight straight) {
        this.straight = straight;
    }

    @Override
    public Error validateMove(Card card) {
        if (straight.isEmpty() && card.numericNumber() != 12) {
            return Error.FIRSTSTRAIGHT;
        } else {
            if (!straight.getTopNumber().consecutivosMenores(card.getNumber())) {
                return Error.STRAIGHT;
            } else {
                if (straight.getTop().color() == card.color()) {
                    return Error.DISTINCT_COLOR;
                }

            }
        }
        return null;
    }
}
