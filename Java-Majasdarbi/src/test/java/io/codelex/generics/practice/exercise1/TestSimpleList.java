package io.codelex.generics.practice.exercise1;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSimpleList {
    @Test
    public void shouldAddTheItemAtIndex() {
        Object[] numbers = {0, 1, 2, 3, 4, 5};
        SimpleList mySimpleList = new SimpleList(numbers);
        mySimpleList.add(3, 69);
        Object[] expected = {0, 1, 2, 69, 3, 4, 5};
        assertArrayEquals(expected, mySimpleList.getStrings());
    }

    @Test
    public void shouldGetTheRightElement() {
        Object[] something = {0, 1, 2, "Arrays", 4, 5};
        SimpleList mySimpleList = new SimpleList(something);
        Object expected = "Arrays";
        Object result = mySimpleList.get(3);
        assertEquals(expected, result);
    }


}
