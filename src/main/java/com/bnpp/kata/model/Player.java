package com.bnpp.kata.model;

public enum Player {

    X('X'), O('O'), EMPTY('\0');

    private char value;

    Player(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
