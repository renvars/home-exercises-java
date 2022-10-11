package io.codelex.generics.printer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestPrinter {
    public static void main(String[] args) {
        Printer p1 = new Printer("JESUS");
        Printer p2 = new Printer(123125);
        Printer p3 = new Printer(new BigDecimal("999999"));
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(99);
        ints.add(5109);
        ints.add(2141);
        Printer p4 = new Printer(ints);
        Map<String, String> strings = new HashMap<>();
        strings.put("Money", "John");
        strings.put("Barnes", "Dollar");
        strings.put("Janis", "TheBest");
        strings.put("Attention", "Sergent");
        strings.put("Peter", "Parker");
        Printer p5 = new Printer(strings);
        Printer p6 = new Printer("arakadabra");
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
        p6.print();
    }
}
