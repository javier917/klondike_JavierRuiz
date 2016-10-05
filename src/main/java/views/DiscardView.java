package views;

import models.Discard;

public class DiscardView extends SingleCardView {

    private Discard discard;

    public DiscardView(Discard discard) {
        super();
        this.discard = discard;
    }

    public void write() {
        super.write(discard);
    }

    @Override
    public String typeSingleDeck() {
        return "Descarte";
    }

}
