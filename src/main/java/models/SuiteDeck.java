package models;

import utils.Stack;

public class SuiteDeck extends Stack {
    private Color color;

    public SuiteDeck(Color color) {
        super();
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public Number getTopNumber() {
        return this.getTop().getNumber();
    }
}
