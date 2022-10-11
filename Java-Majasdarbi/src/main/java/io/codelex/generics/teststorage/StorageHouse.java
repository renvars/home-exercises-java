package io.codelex.generics.teststorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageHouse {

    //Fix this class so that storage house can contain other types of objects not only numbers
    //Test the functionality

    List<Object> items = new ArrayList<>();

    public StorageHouse(Object firstItem) {
        items.add(firstItem);
    }

    public void addMoreItems(Object item) {
        items.add(item);
    }

    public Optional<Object> getMaybeFirstItem() {
        return items.stream().findFirst();
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

}
