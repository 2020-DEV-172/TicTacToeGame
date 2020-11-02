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

    public boolean checkIfAnyRowIsMarkedBySamePlayer() {
        for (int row = INDEX_1; row < INDEX_10; row += INDEX_3) {
            if (checkIfPositionsHaveSamePlayer(new Position(row), new Position(row + INDEX_1), new Position(row + INDEX_2))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfAnyColumnIsMarkedBySamePlayer() {
        for (int column = INDEX_1; column < INDEX_4; column++) {
            if (checkIfPositionsHaveSamePlayer(new Position(column), new Position(column + INDEX_3), new Position(column + INDEX_6))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfPositionsHaveSamePlayer(Position pos1, Position pos2, Position pos3) {
        return getPlayerAt(pos1) != Player.EMPTY.getValue() && getPlayerAt(pos1) == getPlayerAt(pos2)
                && getPlayerAt(pos2) == getPlayerAt(pos3);
    }

    public boolean checkIfAnyDiagonalIsMarkedBySamePlayer() {
        return checkIfPositionsHaveSamePlayer(new Position(INDEX_1), new Position(INDEX_5), new Position(INDEX_9)) ||
                checkIfPositionsHaveSamePlayer(new Position(INDEX_3), new Position(INDEX_5), new Position(INDEX_7));
    }

    public boolean checkIfAllPositionsAreOccupied() {
        return gameCounter.equals(INDEX_9);
    }
}
