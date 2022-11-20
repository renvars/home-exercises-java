package io.codelex.generics.practice.exercise1;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGenericsList {
    @Test
    public void testIfGetsElement() {
        String[] stringElements = {"one", "two", "three"};
        GenericList<String> strings = new GenericList<>(stringElements);
        Integer[] numberElements = {0, 1, 2};
        GenericList<Integer> numbers = new GenericList<>(numberElements);
        Character[] charElements = {'a', 'b', 'x'};
        GenericList<Character> chars = new GenericList<>(charElements);
        Person[] personElements = {new Person("Peter"), new Person("Johana"), new Person("Gothmog")};
        GenericList<Person> persons = new GenericList<>(personElements);
        assertEquals("one", strings.get(0));
        assertEquals(2, numbers.get(2));
        assertEquals('b', chars.get(1));
        assertEquals("Peter", persons.get(0).name);

    }

    @Test
    public void testAddMethod() {
        Person[] personElements = {new Person("Peter"), new Person("Johana"), new Person("Gothmog")};
        Person[] personExpected = {new Person("THE BIG TESTER"), new Person("Peter"), new Person("Johana"), new Person("Gothmog")};
        GenericList<Person> persons = new GenericList<>(personElements);
        Person person = new Person("THE BIG TESTER");
        persons.add(0, person);
        assertEquals("THE BIG TESTER", persons.get(0).name);
        assertEquals("Peter", persons.get(1).name);
        assertEquals("Johana", persons.get(2).name);
        assertEquals("Gothmog", persons.get(3).name);

    }
}
