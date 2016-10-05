package views;

import models.Suite;
import utils.InputOutput;

public class SuiteView {
    private static final char[] SUITES = {'B', 'O', 'E', 'C'};

    private Suite suite;

    private InputOutput io;

    public SuiteView(Suite suite) {
        this.suite = suite;
        io = new InputOutput();
    }

    void write(String title) {
        io.print(title + this.toChar());
    }

    public char toChar() {
        return SUITES[suite.ordinal()];
    }
}
