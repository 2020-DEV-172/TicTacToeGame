package com.bnpp.kata;

import com.bnpp.kata.exception.InvalidInputException;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static com.bnpp.kata.constant.Constant.*;
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
        StringBuilder inputStreamBuilder = new StringBuilder(STRING_NINE).append(NEW_LINE).append(STRING_FOUR)
                .append(NEW_LINE).append(STRING_SIX).append(NEW_LINE).append(STRING_SEVEN).append(NEW_LINE)
                .append(STRING_THREE);
        System.setIn(new ByteArrayInputStream(inputStreamBuilder.toString().getBytes()));

        String gameResult = gameStarter.startGame();

        assertThat(gameResult, is(X_HAS_WON_THE_GAME));
    }
}
