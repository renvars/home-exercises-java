package io.codelex.generics.practice.exercise1.listinterface;

import java.math.BigDecimal;

public class IntegersList implements ListInterface {
    private Integer[] integers;

    public IntegersList(Integer[] integers) {
        this.integers = integers;
    }

    @Override
    public void add(int i, Object el) {
        Integer[] res = new Integer[integers.length + 1];
        for (int j = 0; j < integers.length; j++) {
            if (i == j) {
                res[j] = (Integer) el;
                res[j + 1] = integers[j];
            } else {
                if (j > i) {
                    res[j + 1] = integers[j];
                } else {
                    res[j] = integers[j];
                }

            }
        }
        setIntegers(res);
    }

    @Override
    public Object get(int i) {
        Integer res = null;
        for (int j = 0; j < this.integers.length; j++) {
            if (j == i) {
                res = integers[j];
            }
        }
        return res;
    }
    //Getters and Setters

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }
}
