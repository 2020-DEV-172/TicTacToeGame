package com.bnpp.kata;

import com.bnpp.kata.model.Player;
import com.bnpp.kata.model.Position;

import static com.bnpp.kata.constant.Constant.*;
import static com.bnpp.kata.constant.Constant.INDEX_0;

public class Board {

    private char[][] boardGrid;
    private Integer gameCounter = INDEX_0;

    public Board() {
        this.boardGrid = new char[INDEX_3][INDEX_3];
    }

    public void markPlayerAt(Position position) {
        gameCounter++;
        boardGrid[position.getRowIndex()][position.getColIndex()] = getCurrentPlayer();
    }

    public char getPlayerAt(Position position) {
        return boardGrid[position.getRowIndex()][position.getColIndex()];
    }

    public char getCurrentPlayer() {
        return gameCounter % INDEX_2 == INDEX_0 ? Player.O.getValue() : Player.X.getValue();
    }

    public char getNextPlayer() {
        return getCurrentPlayer() == Player.X.getValue() ? Player.O.getValue() : Player.X.getValue();
    }

    public boolean checkIfPositionIsAlreadyOccupied(Position position) {
        return getPlayerAt(position) != Player.EMPTY.getValue();
    }
}
