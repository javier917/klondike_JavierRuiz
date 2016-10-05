package controllers;

import java.util.List;

import models.Board;
import models.Deck;
import models.Discard;
import models.State;
import models.Straight;
import models.SuiteDeck;

public class Controller {
    protected Board boardGame;

    public Controller(Board boardGame) {
        assert boardGame != null;
        this.boardGame = boardGame;

    }

    public Board getBoardGame() {
        return this.boardGame;
    }

    public State getState() {
        return this.boardGame.getState();
    }

    public void setState(State state) {
        assert state != null;
        this.boardGame.setState(state);
    }

    public boolean win() {
        return boardGame.win();
    }

    public Straight getStraight(int straight) {
        assert straight >= 0;
        return boardGame.getStraights().get(straight);
    }

    public List<Straight> getStraights() {
        return boardGame.getStraights();
    }

    public Deck getDeck() {
        return boardGame.getDeck();
    }

    public Discard getDiscard() {
        return boardGame.getDiscard();
    }

    public SuiteDeck getSuiteDecks(int suite) {
        assert suite >= 0;
        return boardGame.getSuiteDecks().get(suite);
    }

    public List<SuiteDeck> getSuiteDecks() {
        return boardGame.getSuiteDecks();
    }

}
