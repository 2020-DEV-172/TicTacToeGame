package com.bnpp.kata;

import com.bnpp.kata.exception.PositionInvalidException;
import com.bnpp.kata.exception.PositionNotEmptyException;
import com.bnpp.kata.model.Position;

import java.util.logging.Logger;

import static com.bnpp.kata.constant.Constant.*;

public class TicTacToe {

    private Board board;
    private static final Logger logger = Logger.getLogger(TicTacToe.class.getName());

    public TicTacToe() {
        this.board = new Board();
    }

    public String playGame(Position position) throws PositionInvalidException, PositionNotEmptyException {
        validatePosition(position);
        board.markPlayerAt(position);
        String output;
        if (checkWinner()) {
            output = getCurrentPlayer() + GAME_WON;
        } else if (checkIfAllPositionsAreOccupied()) {
            output = GAME_DRAW;
        } else {
            output = GAME_CONTINUES;
        }
        return output;
    }

    public boolean checkIfAllPositionsAreOccupied() {
        return board.checkIfAllPositionsAreOccupied();
    }

    private boolean checkWinner() {
        return board.checkIfAnyRowIsMarkedBySamePlayer() ||
                board.checkIfAnyColumnIsMarkedBySamePlayer() ||
                board.checkIfAnyDiagonalIsMarkedBySamePlayer();
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

    public void printBoard() {
        String boardInfo = board.assembleBoard();
        logger.info(boardInfo);
    }
}
