package io.codelex.generics.practice.exercise1.listinterface;

import java.io.ObjectStreamException;

public class StringList implements ListInterface {
    private String[] strings;

    public StringList(String[] strings) {
        this.strings = strings;
    }

    @Override
    public void add(int i, Object el) {
        String[] res = new String[strings.length + 1];
        for (int j = 0; j < strings.length; j++) {
            if (i == j) {
                res[j] = (String) el;
                res[j + 1] = strings[j];
            } else {
                if (j > i) {
                    res[j + 1] = strings[j];
                } else {
                    res[j] = strings[j];
                }

            }
        }
        setStrings(res);
    }

    @Override
    public Object get(int i) {
        String res = null;
        for (int j = 0; j < this.strings.length; j++) {
            if (j == i) {
                res = strings[j];
            }
        }
        return res;
    }
    //Getters and Setters

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}
