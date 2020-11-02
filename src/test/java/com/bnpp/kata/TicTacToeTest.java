package com.bnpp.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playGame(0, 0, 'X');

        assertThat(ticTacToe.getPlayerAt(0, 0), is('X'));
    }
}
