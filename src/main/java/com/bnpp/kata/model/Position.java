package com.bnpp.kata.model;

public class Position {

    private Integer rowIndex;
    private Integer colIndex;

    public Position(Integer rowIndex, Integer colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    public Integer getColIndex() {
        return colIndex;
    }
}
