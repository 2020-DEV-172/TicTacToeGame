package com.bnpp.kata;

import com.bnpp.kata.exception.InvalidInputException;
import org.junit.Test;

public class GameStarterTest {

    @Test(expected = InvalidInputException.class)
    public void throwExceptionIfUserInputNonDigitValue() throws InvalidInputException {
        GameStarter gameStarter = new GameStarter();
        String input = "qwerty";

        gameStarter.validateInput(input);
    }
}
