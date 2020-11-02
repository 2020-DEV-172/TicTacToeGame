package com.bnpp.kata;

import com.bnpp.kata.constant.Constant;
import com.bnpp.kata.exception.InvalidInputException;
import com.bnpp.kata.exception.PositionInvalidException;
import com.bnpp.kata.exception.PositionNotEmptyException;
import com.bnpp.kata.model.Position;

import java.util.Scanner;
import java.util.logging.Logger;

import static com.bnpp.kata.constant.Constant.*;

public class GameStarter {

    private static final Logger logger = Logger.getLogger(GameStarter.class.getName());
    private TicTacToe ticTacToe;

    public GameStarter() {
        ticTacToe = new TicTacToe();
    }

    public Integer validateInput(String input) throws InvalidInputException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException(Constant.INVALID_INPUT_MSG);
        }
    }

    public String startGame() {
        Scanner scanner = new Scanner(System.in);
        String output = GAME_STARTS;
        while (!ticTacToe.checkIfAllPositionsAreOccupied()) {
            try {
                Integer inputPos = validateInput(scanner.nextLine());
                output = ticTacToe.playGame(new Position(inputPos));
            } catch (InvalidInputException | PositionInvalidException | PositionNotEmptyException e) {
                logger.warning(e.getMessage());
            }
            if (output.contains(GAME_WON)) {
                break;
            }
        }
        return output;
    }
}
