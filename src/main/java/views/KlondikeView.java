package views;


import controllers.Controller;

import utils.InputOutput;
import utils.LimitedIntDialog;

public class KlondikeView {

    private BoardView boardView;

    public KlondikeView(Controller controller) {
        boardView = new BoardView(controller);
    }

    public int write() {
        InputOutput io = new InputOutput();
        io.println("===========================================");
        boardView.write();
        io.println("--------------------------------------------");
        io.println("1. Mover de baraja a descarte");
        io.println("2. Mover de descarte a baraja");
        io.println("3. Mover de descarte a palo");
        io.println("4. Mover de descarte a escalera");
        io.println("5. Mover de escalera a palo");
        io.println("6. Mover de escalera a escalera");
        io.println("7. Mover de palo a escalera");
        io.println("8. Salir");
        LimitedIntDialog interval = new LimitedIntDialog("Elige opcion: ", 8);
        int option = interval.read();
        return option;
    }

    
}
