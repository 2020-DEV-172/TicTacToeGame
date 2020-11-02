package com.bnpp.kata;

import com.bnpp.kata.model.Position;

import static com.bnpp.kata.constant.Constant.*;

public class TicTacToe {

    private Board board;

    public TicTacToe() {
        this.board = new Board();
    }

    public void playGame(Position position) throws Exception {
        if (position.getInputPosition() < INDEX_1 || position.getInputPosition() > INDEX_9) {
            throw new Exception("Input position is out of range, please select any valid position from 1 to 9.");
        }
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
