package klondike;

import models.Logic;
import models.State;

public class Klondike {
    private Logic logic;

    public void play() {
        logic = new Logic();
        do {
            logic.action();
        } while (logic.getSate() == State.IN_GAME);

    }

    public static void main(String[] args) {
        new Klondike().play();
    }

}
