package com.bnpp.kata;

import com.bnpp.kata.exception.PositionInvalidException;
import com.bnpp.kata.exception.PositionNotEmptyException;
import com.bnpp.kata.model.Player;
import com.bnpp.kata.model.Position;
import org.junit.Before;
import org.junit.Test;

import static com.bnpp.kata.constant.Constant.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @Before
    public void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() throws PositionInvalidException, PositionNotEmptyException {
        Position position = new Position(INDEX_1);

        ticTacToe.playGame(position);

        assertThat(ticTacToe.getPlayerAt(position), is(Player.X.getValue()));
    }

    @Test
    public void playerShouldChangeAlternatively() throws PositionInvalidException, PositionNotEmptyException {
        Position position = new Position(INDEX_1);

        ticTacToe.playGame(position);

        assertThat(ticTacToe.getCurrentPlayer(), is(Player.X.getValue()));
        assertThat(ticTacToe.getNextPlayer(), is(Player.O.getValue()));
    }

    @Test(expected = PositionInvalidException.class)
    public void throwExceptionWhenPlayerTriesToMarkInOutOfRangePosition() throws PositionInvalidException, PositionNotEmptyException {
        Position position = new Position(INDEX_0);

        ticTacToe.playGame(position);
    }

    @Test(expected = PositionNotEmptyException.class)
    public void throwExceptionWhenPlayerTriesToMarkInAlreadyOccupiedPosition() throws PositionInvalidException, PositionNotEmptyException {
        Position position = new Position(INDEX_1);

        ticTacToe.playGame(position);
        ticTacToe.playGame(position);
    }

    @Test
    public void declareWinnerIfAnyRowIsMarkedBySamePlayer() throws PositionNotEmptyException, PositionInvalidException {
        Position position7 = new Position(INDEX_7);
        Position position4 = new Position(INDEX_4);
        Position position9 = new Position(INDEX_9);
        Position position5 = new Position(INDEX_5);
        Position position8 = new Position(INDEX_8);

        ticTacToe.playGame(position7);
        ticTacToe.playGame(position4);
        ticTacToe.playGame(position9);
        ticTacToe.playGame(position5);

        assertThat(ticTacToe.playGame(position8), is(ticTacToe.getCurrentPlayer() + " has won the game."));
    }

    @Test
    public void declareWinnerIfAnyColumnIsMarkedBySamePlayer() throws PositionNotEmptyException, PositionInvalidException {
        Position position2 = new Position(INDEX_2);
        Position position4 = new Position(INDEX_4);
        Position position5 = new Position(INDEX_5);
        Position position7 = new Position(INDEX_7);
        Position position8 = new Position(INDEX_8);

        ticTacToe.playGame(position2);
        ticTacToe.playGame(position4);
        ticTacToe.playGame(position5);
        ticTacToe.playGame(position7);

        assertThat(ticTacToe.playGame(position8), is(ticTacToe.getCurrentPlayer() + " has won the game."));
    }

    @Test
    public void declareWinnerIfAnyDiagonalIsMarkedBySamePlayer() throws PositionNotEmptyException, PositionInvalidException {
        Position position2 = new Position(INDEX_2);
        Position position4 = new Position(INDEX_4);
        Position position5 = new Position(INDEX_5);
        Position position7 = new Position(INDEX_7);
        Position position3 = new Position(INDEX_3);

        ticTacToe.playGame(position3);
        ticTacToe.playGame(position4);
        ticTacToe.playGame(position5);
        ticTacToe.playGame(position2);

        assertThat(ticTacToe.playGame(position7), is(ticTacToe.getCurrentPlayer() + " has won the game."));
    }

    @Test
    public void declareDrawIfAllPositionsOccupiedWithoutAWinner() throws PositionNotEmptyException, PositionInvalidException {
        Position position3 = new Position(INDEX_3);
        Position position4 = new Position(INDEX_4);
        Position position9 = new Position(INDEX_9);
        Position position5 = new Position(INDEX_5);
        Position position8 = new Position(INDEX_8);
        Position position7 = new Position(INDEX_7);
        Position position1 = new Position(INDEX_1);
        Position position2 = new Position(INDEX_2);
        Position position6 = new Position(INDEX_6);

        ticTacToe.playGame(position5);
        ticTacToe.playGame(position3);
        ticTacToe.playGame(position6);
        ticTacToe.playGame(position4);
        ticTacToe.playGame(position1);
        ticTacToe.playGame(position9);
        ticTacToe.playGame(position8);
        ticTacToe.playGame(position2);

        assertThat(ticTacToe.playGame(position7), is("Game is draw, as all the positions have been filled without a winner."));
    }
}
