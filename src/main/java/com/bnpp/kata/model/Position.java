package com.bnpp.kata.model;

import java.util.HashMap;
import java.util.Map;

public class Position {

    private Integer inputPosition;
    private static Map<Integer, Integer[]> indexMap = new HashMap<>();

    static {
        indexMap.put(1, new Integer[]{0, 0});
        indexMap.put(2, new Integer[]{0, 1});
        indexMap.put(3, new Integer[]{0, 2});
        indexMap.put(4, new Integer[]{1, 0});
        indexMap.put(5, new Integer[]{1, 1});
        indexMap.put(6, new Integer[]{1, 2});
        indexMap.put(7, new Integer[]{2, 0});
        indexMap.put(8, new Integer[]{2, 1});
        indexMap.put(9, new Integer[]{2, 2});
    }

    public Position(Integer inputPosition) {
        this.inputPosition = inputPosition;
    }

    public Integer getRowIndex() {
        return indexMap.get(inputPosition)[0];
    }

    public Integer getColIndex() {
        return indexMap.get(inputPosition)[1];
    }
}
