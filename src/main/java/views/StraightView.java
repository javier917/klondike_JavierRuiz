package views;

import models.Straight;
import utils.Card;
import utils.InputOutput;
import utils.LimitedIntDialog;

public class StraightView {
    private InputOutput io;
    //public final int NUMBER_STRAIGHT=7;
    public StraightView() {
        io = new InputOutput();
    }

    public void write(Straight straight, int identificadorEscalera) {
       assert straight!=null;
       io.print("Escalera "+identificadorEscalera+" : "); 
       if (straight.isEmpty()) {
            io.println("<Vacio>");
        } else {
            Card[] cards = straight.getCards();
            for (int i = 0; i < straight.getTopIndex(); i++) {
                io.print("[");
                if (cards[i].isFlip()) {
                    CardView cardView = new CardView(cards[i]);
                    cardView.write();
                    io.println("]");
                }
            }
        }
    }
    
    public int read(Straight straight){
        return new LimitedIntDialog("Cuantas cartas?",straight.getNumFlipCards()).read();  
    }
}
