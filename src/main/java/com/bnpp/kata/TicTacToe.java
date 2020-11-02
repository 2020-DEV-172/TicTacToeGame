package com.bnpp.kata;

import com.bnpp.kata.model.Player;

import static com.bnpp.kata.constant.Constant.*;

public class TicTacToe {

    private char[][] boardGrid;
    private Integer gameCounter = INDEX_0;

    public TicTacToe() {
        this.boardGrid = new char[INDEX_3][INDEX_3];
    }

    public void playGame(int rowIndex, int colIndex) {
        gameCounter++;
        boardGrid[rowIndex][colIndex] = getCurrentPlayer();
    }

    public char getPlayerAt(int rowIndex, int colIndex) {
        return boardGrid[rowIndex][colIndex];
    }

    public char getCurrentPlayer() {
        return gameCounter % INDEX_2 == INDEX_0 ? Player.O.getValue() : Player.X.getValue();
    }

    public char getNextPlayer() {
        return getCurrentPlayer() == Player.X.getValue() ? Player.O.getValue() : Player.X.getValue();
    }
}
