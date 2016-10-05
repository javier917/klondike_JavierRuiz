package views;

import models.Number;
import utils.InputOutput;

public class NumberView {
    private static final char[] NUMBERS = {'A', '2', '3', '4', '5', '6', '7', 'J', 'Q', 'K'};

    private Number number;

    private InputOutput io;

    public NumberView(Number number) {
        this.number = number;
        io = new InputOutput();
    }

    public void write(String title) {
        io.print(title + this.toChar());
    }

    public char toChar() {
        return NUMBERS[number.ordinal()];
    }

}
