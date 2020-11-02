package com.bnpp.kata;

import com.bnpp.kata.model.Player;
import com.bnpp.kata.model.Position;
import org.junit.Test;

import static com.bnpp.kata.constant.Constant.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() {
        Board board = new Board();
        Position position = new Position(1);

        board.markPlayerAt(position);

        assertThat(board.getPlayerAt(position), is(Player.X.getValue()));
    }

    @Test
    public void playerShouldChangeAlternatively() {
        Board board = new Board();
        Position position = new Position(1);

        board.markPlayerAt(position);

        assertThat(board.getCurrentPlayer(), is(Player.X.getValue()));
        assertThat(board.getNextPlayer(), is(Player.O.getValue()));
    }
}
