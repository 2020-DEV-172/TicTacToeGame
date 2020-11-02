package com.bnpp.kata;

public class TicTacToe {

    private char[][] boardGrid;
    public static final Integer INDEX_3 = 3;

    public TicTacToe() {
        this.boardGrid = new char[INDEX_3][INDEX_3];
    }

    public void playGame(int rowIndex, int colIndex, char player) {
        boardGrid[rowIndex][colIndex] = player;
    }

    public char getPlayerAt(int rowIndex, int colIndex) {
        return boardGrid[rowIndex][colIndex];
    }
}
