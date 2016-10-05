package views;

import utils.Card;
import utils.InputOutput;

public class CardView {
    private Card card;

    private InputOutput io;

    public CardView(Card card) {
        this.card = card;
        io = new InputOutput();
    }

    public void write() {
        NumberView numberView = new NumberView(card.getNumber());
        SuiteView suiteView = new SuiteView(card.getSuite());
        String tittle = numberView.toChar()+","+suiteView.toChar();
        io.print(tittle);
    }
}
