package com.bnpp.kata;

import com.bnpp.kata.constant.Constant;
import com.bnpp.kata.exception.InvalidInputException;

public class GameStarter {

    public void validateInput(String input) throws InvalidInputException {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException(Constant.INVALID_INPUT_MSG);
        }
    }
}
