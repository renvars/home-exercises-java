package io.codelex.generics.practice.listinterface;

import io.codelex.generics.practice.exercise1.listinterface.IntegersList;
import io.codelex.generics.practice.exercise1.listinterface.StringList;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntegerList {
    @Test
    public void shouldAddTheItemAtIndex() {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6};
        IntegersList mySimpleList = new IntegersList(numbers);
        mySimpleList.add(3, 420);
        Integer[] expected = {0, 1, 2, 420, 3, 4, 5, 6};
        assertArrayEquals(expected, mySimpleList.getIntegers());
    }

    @Test
    public void shouldGetTheRightElement() {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 100};
        IntegersList mySimpleList = new IntegersList(numbers);
        Object result = mySimpleList.get(6);
        Integer expected = 100;
        assertEquals(expected, result);
    }
}
