package com.bnpp.kata;

import com.bnpp.kata.exception.PositionInvalidException;
import com.bnpp.kata.exception.PositionNotEmptyException;
import com.bnpp.kata.model.Position;

import static com.bnpp.kata.constant.Constant.*;

public class TicTacToe {

    private Board board;

    public TicTacToe() {
        this.board = new Board();
    }

    public String playGame(Position position) throws PositionInvalidException, PositionNotEmptyException {
        validatePosition(position);
        board.markPlayerAt(position);
        String output = "";
        if (board.checkIfAnyRowIsMarkedBySamePlayer() ||
                board.checkIfAnyColumnIsMarkedBySamePlayer()) {
            output = getCurrentPlayer() + " has won the game.";
        }
        return output;
    }

    private void validatePosition(Position position) throws PositionInvalidException, PositionNotEmptyException {
        if (position.getInputPosition() < INDEX_1 || position.getInputPosition() > INDEX_9) {
            throw new PositionInvalidException(POSITION_INVALID_MSG);
        } else if (board.checkIfPositionIsAlreadyOccupied(position)) {
            throw new PositionNotEmptyException(POSITION_NOT_EMPTY_MSG);
        }
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
