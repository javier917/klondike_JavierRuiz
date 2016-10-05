package models;

import controllers.ColorStraightMoveController;
import controllers.Controller;
import controllers.DeckDiscardMoveController;
import controllers.DiscardColorMoveController;
import controllers.DiscardDeckMoveController;
import controllers.DiscardStraightMoveController;
import controllers.StraightColorMoveController;
import controllers.StraightStraihtMoveController;
import utils.LimitedIntDialog;
import views.KlondikeView;

public class Logic {
    private Controller controller;

    KlondikeView klondikeView;

    public Logic() {
        Board boardGame = new Board();
        controller = new Controller(boardGame);
        this.klondikeView = new KlondikeView(controller);
    }

    public void action() {
        int option = this.klondikeView.write();
        option(option);
    }

    public State getSate() {
        return controller.getState();
    }

    public void option(int option) {
        Board boardgame = controller.getBoardGame();
        switch (option) {
        case 1:
            this.DeckDiscard(boardgame);
            break;
        case 2:
            this.DiscardDeck(boardgame);
            break;
        case 3:
            this.DiscardSuite(boardgame);
            break;
        case 4:
            this.DiscardStraight(boardgame);
            break;
        case 5:
            this.StraightSuite(boardgame);
            break;
        case 6:
            this.StraightStraight(boardgame);
            break;
        case 7:
            this.SuiteStraight(boardgame);
            break;
        default:
            this.controller.setState(State.EXIT);
        }
        boardgame.win();
    }

    private void DeckDiscard(Board boardgame) {
        DeckDiscardMoveController move = new DeckDiscardMoveController(boardgame);
        if (move.validate() == null) {
            move.move();
        } else {
            move.validate().toString();
        }
    }

    private void DiscardDeck(Board boardgame) {
        DiscardDeckMoveController discardDeckMove = new DiscardDeckMoveController(boardgame);
        if (discardDeckMove.validate() == null) {
            discardDeckMove.move();
        } else {
            discardDeckMove.validate().toString();
        }
    }

    private void DiscardSuite(Board boardgame) {
        SuiteDeck suiteDeck = getSuiteDeck();
        DiscardColorMoveController discardColor = new DiscardColorMoveController(boardgame, suiteDeck);
        if (discardColor.validate() == null) {
            discardColor.move();
        } else {
            discardColor.validate().toString();
        }
    }

    private void DiscardStraight(Board boardgame) {
        Straight straight = getStraight("");
        DiscardStraightMoveController discardStraightMove = new DiscardStraightMoveController(boardgame, straight);
        if (discardStraightMove.validate() == null) {
            discardStraightMove.move();
        } else {
            discardStraightMove.validate().toString();
        }
    }

    private void StraightSuite(Board boardgame) {
        Straight straight = getStraight("");
        SuiteDeck suiteDeck = getSuiteDeck();
        StraightColorMoveController straightSuiteMove = new StraightColorMoveController(boardgame, straight, suiteDeck);
        if (straightSuiteMove.validate() == null) {
            straightSuiteMove.move();
        } else {
            straightSuiteMove.validate().toString();
        }
    }

    private void StraightStraight(Board boardgame) {
        Straight straightOrigin = getStraight("Origen");
        Straight straightDestiny = getStraight("Destino");
        StraightStraihtMoveController straightMove = new StraightStraihtMoveController(boardgame, straightOrigin, straightDestiny);
        if (straightMove.validate() == null) {
            straightMove.move();
        } else {
            straightMove.validate().toString();
        }
    }

    private void SuiteStraight(Board boardgame) {
        LimitedIntDialog intervalSuite = new LimitedIntDialog("Elige palo: ", 4);
        int suiteNum = intervalSuite.read() - 1;
        SuiteDeck suiteDeck = controller.getSuiteDecks(suiteNum);
        Straight straight = getStraight("");
        ColorStraightMoveController colorStraightMove = new ColorStraightMoveController(boardgame, suiteDeck, straight);
        if (colorStraightMove.validate() == null) {
            colorStraightMove.move();
        } else {
            colorStraightMove.validate().toString();
        }
    }

    private Straight getStraight(String title) {
        LimitedIntDialog intervalStraight = new LimitedIntDialog("Elige escalera " + title + ": ", 7);
        int straightNum = intervalStraight.read() - 1;
        Straight straight = controller.getStraight(straightNum);
        return straight;
    }

    private SuiteDeck getSuiteDeck() {
        LimitedIntDialog intervalSuite = new LimitedIntDialog("Elige palo: ", 4);
        int suite = intervalSuite.read() - 1;
        SuiteDeck suiteDeck = controller.getSuiteDecks(suite);
        return suiteDeck;
    }
}
