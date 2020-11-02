package com.bnpp.kata;

public class TicTacToe {

    private char[][] boardGrid = new char[3][3];

    public void playGame(int i, int i1, char x) {
        boardGrid[i][i1] = x;
    }

    public char getPlayerAt(int i, int i1) {
        return boardGrid[i][i1];
    }
}
