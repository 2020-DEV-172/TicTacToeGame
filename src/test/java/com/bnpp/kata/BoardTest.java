package com.bnpp.kata;

import com.bnpp.kata.model.Player;
import org.junit.Test;

import static com.bnpp.kata.constant.Constant.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() {
        Board board = new Board();

        board.markPlayerAt(INDEX_0, INDEX_0);

        assertThat(board.getPlayerAt(INDEX_0, INDEX_0), is(Player.X.getValue()));
    }

    @Test
    public void playerShouldChangeAlternatively() {
        Board board = new Board();

        board.markPlayerAt(INDEX_0, INDEX_0);

        assertThat(board.getCurrentPlayer(), is(Player.X.getValue()));
        assertThat(board.getNextPlayer(), is(Player.O.getValue()));
    }
}
