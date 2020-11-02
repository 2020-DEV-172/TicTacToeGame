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
            if (getPlayerAt(new Position(row)) != Player.EMPTY.getValue() &&
                    getPlayerAt(new Position(row)) == getPlayerAt(new Position(row + INDEX_1)) &&
                    getPlayerAt(new Position(row + INDEX_1)) == getPlayerAt(new Position(row + INDEX_2))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfFirstColumnIsMarkedBySamePlayer() {
        return getPlayerAt(new Position(INDEX_1)) != Player.EMPTY.getValue() &&
                getPlayerAt(new Position(INDEX_1)) == getPlayerAt(new Position(INDEX_4)) &&
                getPlayerAt(new Position(INDEX_4)) == getPlayerAt(new Position(INDEX_7));
    }

    public boolean checkIfSecondColumnIsMarkedBySamePlayer() {
        return getPlayerAt(new Position(INDEX_2)) != Player.EMPTY.getValue() &&
                getPlayerAt(new Position(INDEX_2)) == getPlayerAt(new Position(INDEX_5)) &&
                getPlayerAt(new Position(INDEX_5)) == getPlayerAt(new Position(INDEX_8));
    }

    public boolean checkIfThirdColumnIsMarkedBySamePlayer() {
        return getPlayerAt(new Position(INDEX_3)) != Player.EMPTY.getValue() &&
                getPlayerAt(new Position(INDEX_3)) == getPlayerAt(new Position(INDEX_6)) &&
                getPlayerAt(new Position(INDEX_6)) == getPlayerAt(new Position(INDEX_9));
    }
}
