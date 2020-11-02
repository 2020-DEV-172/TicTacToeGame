package com.bnpp.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    public static final Integer INDEX_0 = 0;
    public static final char X_PLAYER = 'X';

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.playGame(INDEX_0, INDEX_0, X_PLAYER);

        assertThat(ticTacToe.getPlayerAt(INDEX_0, INDEX_0), is(X_PLAYER));
    }
}
