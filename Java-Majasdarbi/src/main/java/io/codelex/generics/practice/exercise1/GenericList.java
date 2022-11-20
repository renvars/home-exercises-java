package io.codelex.generics.practice.exercise1;

import java.lang.reflect.Array;

public class GenericList<T> {
    private T[] genericsCollection;

    public GenericList(T[] genericsCollection) {
        this.genericsCollection = genericsCollection;
    }


    public void add(int i, T el) {
        T[] res = (T[]) new Object[genericsCollection.length + 1];
        for (int j = 0; j < genericsCollection.length; j++) {
            if (i == j) {
                res[j] = el;
                res[j + 1] = genericsCollection[j];
            } else {
                if (j > i) {
                    res[j + 1] = genericsCollection[j];
                } else {
                    res[j] = genericsCollection[j];
                }

            }
        }
        setGeneric(res);

    }


    public T get(int i) {
        return genericsCollection[i];

    }

    //GETTERS AND SETTERS

    public T[] getGenericsCollection() {
        return genericsCollection;
    }

    public void setGeneric(T[] generic) {
        this.genericsCollection = generic;
    }
}
