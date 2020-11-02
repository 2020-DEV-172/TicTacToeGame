package com.bnpp.kata;

import com.bnpp.kata.model.Player;
import com.bnpp.kata.model.Position;
import org.junit.Before;
import org.junit.Test;

import static com.bnpp.kata.constant.Constant.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {

    private Board board;

    @Before
    public void setup() {
        board = new Board();
    }

    @Test
    public void playerShouldBeAbleToMarkXInAnyPositionAndRetrieveTheSame() {
        Position position = new Position(INDEX_1);

        board.markPlayerAt(position);

        assertThat(board.getPlayerAt(position), is(Player.X.getValue()));
    }

    @Test
    public void playerShouldChangeAlternatively() {
        Position position = new Position(INDEX_1);

        board.markPlayerAt(position);

        assertThat(board.getCurrentPlayer(), is(Player.X.getValue()));
        assertThat(board.getNextPlayer(), is(Player.O.getValue()));
    }

    @Test
    public void returnTrueIfPositionIsAlreadyOccupied() {
        Position position = new Position(INDEX_1);

        board.markPlayerAt(position);

        assertThat(board.checkIfPositionIsAlreadyOccupied(position), is(true));
    }
}
