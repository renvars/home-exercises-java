package io.codelex.generics.practice.exercise2;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConcatWildcard {
    @Test
    public void testIfStringIsShown() {
        List<String> strings = new ArrayList<>();
        strings.add("word");
        Concat concat = new Concat();
        String result = concat.concatenate(strings);
        String expected = "String: word";
        assertEquals(expected, result);
    }

    @Test
    public void testIfIntegerIsShown() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        Concat concat = new Concat();
        String result = concat.concatenate(ints);
        String expected = "Integers:+1";
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleElements() {
        List<String> strings = new ArrayList<>();
        strings.add("word");
        strings.add("pasta");
        strings.add("Shakespeare");
        Concat concat = new Concat();
        String result = concat.concatenate(strings);
        String expected = "String: word pasta Shakespeare";
        assertEquals(expected, result);
    }


}
