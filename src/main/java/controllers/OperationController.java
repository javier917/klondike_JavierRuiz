package controllers;

import models.Board;

public abstract class OperationController extends Controller {

    protected OperationController(Board boardGame) {
        super(boardGame);
    }

}
