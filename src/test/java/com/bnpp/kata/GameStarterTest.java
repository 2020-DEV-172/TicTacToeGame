package com.bnpp.kata;

import com.bnpp.kata.exception.InvalidInputException;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameStarterTest {

    @Test(expected = InvalidInputException.class)
    public void throwExceptionIfUserInputNonDigitValue() throws InvalidInputException {
        GameStarter gameStarter = new GameStarter();
        String input = "qwerty";

        gameStarter.validateInput(input);
    }

    @Test
    public void gameShouldProduceResultForGivenInputs() {
        GameStarter gameStarter = new GameStarter();
        StringBuilder inputStreamBuilder = new StringBuilder("9").append("\n").append("4")
                .append("\n").append("6").append("\n").append("7").append("\n")
                .append("3");
        System.setIn(new ByteArrayInputStream(inputStreamBuilder.toString().getBytes()));

        String gameResult = gameStarter.startGame();

        assertThat(gameResult, is("X has won the game."));
    }
}
