package io.codelex.oop.summary.generics.combiner;

import java.math.BigDecimal;

public class TestCombiner {
    public static void main(String[] args) {
        Object one1 = Combiner.combineTwoItems(1, 2);
        Object one2 = Combiner.combineTwoItems("one", "two");
        Object one3 = Combiner.combineTwoItems(9.5, "something");
        Object one4 = Combiner.combineTwoItems(new BigDecimal("1234"), "Amazing");
        System.out.println(one1);
        System.out.println(one2);
        System.out.println(one3);
        System.out.println(one4);
    }
}
