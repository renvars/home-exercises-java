package io.codelex.generics.practice.exercise2;

import java.util.List;

public class AddWild {

    public <V> void add(V value, List<? super V> list) {
        list.add(value);
    }

    public <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

    public <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }
}
