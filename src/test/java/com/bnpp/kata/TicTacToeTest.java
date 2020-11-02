package com.bnpp.kata;

import com.bnpp.kata.exception.PositionInvalidException;
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
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() throws PositionInvalidException {
        Position position = new Position(INDEX_1);

        ticTacToe.playGame(position);

        assertThat(ticTacToe.getPlayerAt(position), is(Player.X.getValue()));
    }

    @Test
    public void playerShouldChangeAlternatively() throws PositionInvalidException {
        Position position = new Position(INDEX_1);

        ticTacToe.playGame(position);

        assertThat(ticTacToe.getCurrentPlayer(), is(Player.X.getValue()));
        assertThat(ticTacToe.getNextPlayer(), is(Player.O.getValue()));
    }

    @Test(expected = PositionInvalidException.class)
    public void throwExceptionWhenPlayerTriesToMarkInOutOfRangePosition() throws PositionInvalidException {
        Position position = new Position(INDEX_0);

        ticTacToe.playGame(position);
    }
}
