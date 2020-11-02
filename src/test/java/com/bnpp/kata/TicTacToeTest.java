package com.bnpp.kata;

import com.bnpp.kata.model.Player;
import com.bnpp.kata.model.Position;
import org.junit.Test;

import static com.bnpp.kata.constant.Constant.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();
        Position position = new Position(1);

        ticTacToe.playGame(position);

        assertThat(ticTacToe.getPlayerAt(position), is(Player.X.getValue()));
    }

    @Test
    public void playerShouldChangeAlternatively() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();
        Position position = new Position(1);

        ticTacToe.playGame(position);

        assertThat(ticTacToe.getCurrentPlayer(), is(Player.X.getValue()));
        assertThat(ticTacToe.getNextPlayer(), is(Player.O.getValue()));
    }

    @Test(expected = Exception.class)
    public void throwExceptionWhenPlayerTriesToMarkInOutOfRangePosition() throws Exception {
        TicTacToe ticTacToe = new TicTacToe();
        Position position = new Position(INDEX_0);

        ticTacToe.playGame(position);
    }
}
