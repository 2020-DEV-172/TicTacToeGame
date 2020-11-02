package com.bnpp.kata.model;

public enum Player {

    X('X'), O('O');

    private char value;

    Player(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
