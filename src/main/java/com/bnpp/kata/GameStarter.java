package com.bnpp.kata;

import com.bnpp.kata.exception.InvalidInputException;

public class GameStarter {

    public void validateInput(String input) throws InvalidInputException {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Entered Position is invalid. Please enter a digit from 1 to 9");
        }
    }
}
