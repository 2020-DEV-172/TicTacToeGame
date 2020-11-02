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

    @Test
    public void checkIfFirstRowIsMarkedBySamePlayer() {
        Position position1 = new Position(INDEX_1);
        Position position6 = new Position(INDEX_6);
        Position position2 = new Position(INDEX_2);
        Position position8 = new Position(INDEX_8);
        Position position3 = new Position(INDEX_3);

        board.markPlayerAt(position1);
        board.markPlayerAt(position6);
        board.markPlayerAt(position2);
        board.markPlayerAt(position8);
        board.markPlayerAt(position3);

        assertThat(board.checkIfFirstRowIsMarkedBySamePlayer(), is(true));
    }
}