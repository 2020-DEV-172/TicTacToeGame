package com.bnpp.kata;

import com.bnpp.kata.model.Position;

public class TicTacToe {

    private Board board;

    public TicTacToe() {
        this.board = new Board();
    }

    public void playGame(Position position) {
        board.markPlayerAt(position);
    }

    public char getPlayerAt(Position position) {
        return board.getPlayerAt(position);
    }

    public char getCurrentPlayer() {
        return board.getCurrentPlayer();
    }

    public char getNextPlayer() {
        return board.getNextPlayer();
    }
}
