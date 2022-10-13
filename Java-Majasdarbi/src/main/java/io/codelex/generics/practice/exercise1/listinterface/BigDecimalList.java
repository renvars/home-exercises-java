package io.codelex.generics.practice.exercise1.listinterface;

import java.math.BigDecimal;

public class BigDecimalList implements ListInterface {
    private BigDecimal[] bigDecimalLists;

    public BigDecimalList(BigDecimal[] bigDecimalLists) {
        this.bigDecimalLists = bigDecimalLists;
    }


    @Override
    public void add(int i, Object el) {
        BigDecimal[] res = new BigDecimal[bigDecimalLists.length + 1];
        for (int j = 0; j < bigDecimalLists.length; j++) {
            if (i == j) {
                res[j] = new BigDecimal(String.valueOf(el));
                res[j + 1] = bigDecimalLists[j];
            } else {
                if (j > i) {
                    res[j + 1] = bigDecimalLists[j];
                } else {
                    res[j] = bigDecimalLists[j];
                }

            }
        }
        setBigDecimalList(res);
    }

    @Override
    public Object get(int i) {
        BigDecimal res = null;
        for (int j = 0; j < this.bigDecimalLists.length; j++) {
            if (j == i) {
                res = bigDecimalLists[j];
            }
        }
        return res;
    }
    //Getters and Setters

    public BigDecimal[] getBigDecimalList() {
        return bigDecimalLists;
    }

    public void setBigDecimalList(BigDecimal[] bigDecimalLists) {
        this.bigDecimalLists = bigDecimalLists;
    }
}