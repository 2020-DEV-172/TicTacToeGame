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

        assertThat(board.checkIfAnyRowIsMarkedBySamePlayer(), is(true));
    }

    @Test
    public void boardShouldReturnTrueIfSecondRowIsMarkedBySamePlayer() {
        Position position4 = new Position(INDEX_4);
        Position position1 = new Position(INDEX_1);
        Position position5 = new Position(INDEX_5);
        Position position8 = new Position(INDEX_8);
        Position position6 = new Position(INDEX_6);

        board.markPlayerAt(position4);
        board.markPlayerAt(position1);
        board.markPlayerAt(position5);
        board.markPlayerAt(position8);
        board.markPlayerAt(position6);

        assertThat(board.checkIfAnyRowIsMarkedBySamePlayer(), is(true));
    }

    @Test
    public void boardShouldReturnTrueIfThirdRowIsMarkedBySamePlayer() {
        Position position7 = new Position(INDEX_7);
        Position position1 = new Position(INDEX_1);
        Position position8 = new Position(INDEX_8);
        Position position2 = new Position(INDEX_2);
        Position position9 = new Position(INDEX_9);

        board.markPlayerAt(position7);
        board.markPlayerAt(position1);
        board.markPlayerAt(position8);
        board.markPlayerAt(position2);
        board.markPlayerAt(position9);

        assertThat(board.checkIfAnyRowIsMarkedBySamePlayer(), is(true));
    }

    @Test
    public void boardShouldReturnTrueIfFirstColumnIsMarkedBySamePlayer() {
        Position position1 = new Position(INDEX_1);
        Position position2 = new Position(INDEX_2);
        Position position4 = new Position(INDEX_4);
        Position position5 = new Position(INDEX_5);
        Position position7 = new Position(INDEX_7);

        board.markPlayerAt(position1);
        board.markPlayerAt(position2);
        board.markPlayerAt(position4);
        board.markPlayerAt(position5);
        board.markPlayerAt(position7);

        assertThat(board.checkIfFirstColumnIsMarkedBySamePlayer(), is(true));
    }

    @Test
    public void boardShouldReturnTrueIfSecondColumnIsMarkedBySamePlayer() {
        Position position2 = new Position(INDEX_2);
        Position position4 = new Position(INDEX_4);
        Position position5 = new Position(INDEX_5);
        Position position7 = new Position(INDEX_7);
        Position position8 = new Position(INDEX_8);

        board.markPlayerAt(position2);
        board.markPlayerAt(position4);
        board.markPlayerAt(position5);
        board.markPlayerAt(position7);
        board.markPlayerAt(position8);

        assertThat(board.checkIfSecondColumnIsMarkedBySamePlayer(), is(true));
    }

    @Test
    public void boardShouldReturnTrueIfThirdColumnIsMarkedBySamePlayer() {
        Position position3 = new Position(INDEX_3);
        Position position4 = new Position(INDEX_4);
        Position position6 = new Position(INDEX_6);
        Position position7 = new Position(INDEX_7);
        Position position9 = new Position(INDEX_9);

        board.markPlayerAt(position3);
        board.markPlayerAt(position4);
        board.markPlayerAt(position6);
        board.markPlayerAt(position7);
        board.markPlayerAt(position9);

        assertThat(board.checkIfThirdColumnIsMarkedBySamePlayer(), is(true));
    }
}
