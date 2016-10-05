package controllers;

import models.Number;
import models.SuiteDeck;
import utils.Card;

public class ValidateMoveToSuiteDeck extends ValidateMove {
    private SuiteDeck suiteDeck;

    public ValidateMoveToSuiteDeck(SuiteDeck suiteDeck) {
        this.suiteDeck = suiteDeck;
    }

    @Override
    public Error validateMove(Card card) {
        if (card.color() != suiteDeck.getColor()) {
            return Error.DISTINCT_COLOR;
        } else {
            if (suiteDeck.isEmpty() && card.getNumber() != Number.A) {
                return Error.FIRSTSUITEDECK;
            } else {
                if (!suiteDeck.getTopNumber().consecutivosMayores(card.getNumber())) {
                    return Error.STRAIGHT;
                }
            }
        }
        return null;
    }

}
