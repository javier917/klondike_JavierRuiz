package views;

import models.Deck;
import utils.InputOutput;

public class DeckView {
    private InputOutput io;

    public DeckView() {
        io = new InputOutput();
    }
    
    public void write(Deck deck){
        assert deck!=null;
        io.print("Baraja: ");
        if(deck.isEmpty()){
            io.println("<Vacio>");
        }else{
            io.println("[X,X]");
        }
    }
}
