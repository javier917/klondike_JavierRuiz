package views;

import utils.InputOutput;
import utils.Stack;

public abstract class SingleCardView {
    private InputOutput io;

    public SingleCardView() {
        io = new InputOutput();
    }

    public void write(Stack stack) {
        assert stack != null;
        io.print(typeSingleDeck()+" ");
        if (stack.isEmpty()) {
            io.println("<Vacio>");
        } else {
            CardView cardView = new CardView(stack.getTop());
            cardView.write();
        }
    }
    
    public abstract String typeSingleDeck();
}
