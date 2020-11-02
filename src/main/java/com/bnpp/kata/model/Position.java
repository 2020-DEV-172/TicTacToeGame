package com.bnpp.kata.model;

import java.util.HashMap;
import java.util.Map;

import static com.bnpp.kata.constant.Constant.*;

public class Position {

    private Integer inputPosition;
    private static final Map<Integer, Integer[]> indexMap = new HashMap<>();

    static {
        indexMap.put(INDEX_1, new Integer[]{INDEX_0, INDEX_0});
        indexMap.put(INDEX_2, new Integer[]{INDEX_0, INDEX_1});
        indexMap.put(INDEX_3, new Integer[]{INDEX_0, INDEX_2});
        indexMap.put(INDEX_4, new Integer[]{INDEX_1, INDEX_0});
        indexMap.put(INDEX_5, new Integer[]{INDEX_1, INDEX_1});
        indexMap.put(INDEX_6, new Integer[]{INDEX_1, INDEX_2});
        indexMap.put(INDEX_7, new Integer[]{INDEX_2, INDEX_0});
        indexMap.put(INDEX_8, new Integer[]{INDEX_2, INDEX_1});
        indexMap.put(INDEX_9, new Integer[]{INDEX_2, INDEX_2});
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

    public Integer getInputPosition() {
        return inputPosition;
    }
}
