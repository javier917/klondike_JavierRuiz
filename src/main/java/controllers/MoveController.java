package controllers;

import models.Board;

public abstract class MoveController extends OperationController {

    protected MoveController(Board boardGame) {
        super(boardGame);
    }

    public abstract void move();

    public abstract Error validate();
}
