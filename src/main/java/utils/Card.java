package utils;

import models.Color;
import models.Number;
import models.Suite;

public class Card {
    Suite suite;

    Number number;

    boolean flip;

    public Card(Number number, Suite suite) {
        this.number = number;
        this.suite = suite;
        flip = false;
    }

    public boolean isFlip() {
        return flip;
    }

    public void setFlip(boolean flip) {
        this.flip = flip;
    }

    public Suite getSuite() {
        return suite;
    }

    public Color color() {
        return getSuite().getColor();
    }

    public Number getNumber() {
        return number;
    }

    public int numericNumber() {
        return getNumber().getNumber();
    }

    public boolean isLess(Card card) {
        return this.numericNumber() < card.numericNumber();
    }

   

}
