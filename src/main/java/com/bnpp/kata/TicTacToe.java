package com.bnpp.kata;

public class TicTacToe {

    private char[][] boardGrid;
    public static final Integer INDEX_3 = 3;
    private Integer gameCounter = 0;

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
        return gameCounter % 2 == 0 ? 'O' : 'X';
    }

    public char getNextPlayer() {
        return getCurrentPlayer() == 'X' ? 'O' : 'X';
    }
}
