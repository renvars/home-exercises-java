package io.codelex.generics.practice.listinterface;

import io.codelex.generics.practice.exercise1.SimpleList;
import io.codelex.generics.practice.exercise1.listinterface.StringList;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringList {
    @Test
    public void shouldAddTheItemAtIndex() {
        String[] numbers = {"zero", "one", "two", "three", "four", "five"};
        StringList mySimpleList = new StringList(numbers);
        mySimpleList.add(3, "Abracadabra");
        String[] expected = {"zero", "one", "two", "Abracadabra", "three", "four", "five"};
        assertArrayEquals(expected, mySimpleList.getStrings());
    }

    @Test
    public void shouldGetTheRightElement() {
        String[] numbers = {"zero", "one", "two", "Abracadabra", "three", "four", "five"};
        StringList mySimpleList = new StringList(numbers);
        Object result = mySimpleList.get(3);
        String expected = "Abracadabra";
        assertEquals(expected, result);
    }
}
