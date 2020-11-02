package com.bnpp.kata;

public class TicTacToe {

    private Board board;

    public TicTacToe() {
        this.board = new Board();
    }

    public void playGame(int rowIndex, int colIndex) {
        board.markPlayerAt(rowIndex, colIndex);
    }

    public char getPlayerAt(int rowIndex, int colIndex) {
        return board.getPlayerAt(rowIndex, colIndex);
    }

    public char getCurrentPlayer() {
        return board.getCurrentPlayer();
    }

    public char getNextPlayer() {
        return board.getNextPlayer();
    }
}
