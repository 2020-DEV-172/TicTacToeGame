package com.bnpp.kata;

import com.bnpp.kata.model.Position;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PositionTest {

    @Test
    public void gameShouldDetermineRowAndColumnIndexForAPositionInTheBoard() {
        Position position = new Position(1);

        assertThat(position.getRowIndex(), is(0));
        assertThat(position.getColIndex(), is(0));
    }
}
