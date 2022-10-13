package io.codelex.generics.practice.exercise1;

public class SimpleList {
    private Object[] objectCollection;

    public SimpleList(Object[] strings) {
        this.objectCollection = strings;
    }


    public void add(int i, Object el) {
        Object[] res = new Object[objectCollection.length + 1];
        for (int j = 0; j < objectCollection.length; j++) {
            if (i == j) {
                res[j] = el;
                res[j + 1] = objectCollection[j];
            } else {
                if (j > i) {
                    res[j + 1] = objectCollection[j];
                } else {
                    res[j] = objectCollection[j];
                }

            }
        }
        setObject(res);

    }

    public Object get(int i) {
        Object res = null;
        for (int j = 0; j < this.objectCollection.length; j++) {
            if (j == i) {
                res = objectCollection[j];
            }
        }
        return res;

    }

    //GETTERS AND SETTERS

    public Object[] getStrings() {
        return objectCollection;
    }

    public void setObject(Object[] strings) {
        this.objectCollection = strings;
    }
}
