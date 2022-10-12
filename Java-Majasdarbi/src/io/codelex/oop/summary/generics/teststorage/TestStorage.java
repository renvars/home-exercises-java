package io.codelex.oop.summary.generics.teststorage;

import java.math.BigDecimal;
import java.util.*;

public class TestStorage {
    public static void main(String[] args) {
        StorageHouse storageHouse = new StorageHouse("FirstMoney");
        storageHouse.addMoreItems(123);
        storageHouse.addMoreItems(new BigDecimal("9999"));
        storageHouse.addMoreItems(new StringBuilder("String builder lads"));
        List<Integer> ints = new ArrayList<>();
        ints.add(78);
        ints.add(8988);
        ints.add(4444);
        ints.add(71231248);
        ints.add(555558);
        storageHouse.addMoreItems(ints);
        Map<String, String> strings = new HashMap<>();
        strings.put("Teacher", "Shifu");
        strings.put("Apprentice", "Po");
        strings.put("Master", "Tigress");
        strings.put("Unknown", "Mantis");
        storageHouse.addMoreItems(strings);
        System.out.println("-----------FIRST ITEM-----------");
        Optional<Object> something = storageHouse.getMaybeFirstItem();
        something.ifPresent(System.out::println);
        System.out.println("-----------ALL ITEMS-----------");
        storageHouse.printItems();
    }
}
