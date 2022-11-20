package io.codelex.generics.practice.listinterface;

import io.codelex.generics.practice.exercise1.listinterface.BigDecimalList;
import io.codelex.generics.practice.exercise1.listinterface.IntegersList;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBigDecimalList {
    @Test
    public void shouldAddTheItemAtIndex() {
        BigDecimal[] numbers = {new BigDecimal("400"), new BigDecimal("50"), new BigDecimal("999")};
        BigDecimalList mySimpleList = new BigDecimalList(numbers);
        mySimpleList.add(1, 420);
        BigDecimal[] expected = {new BigDecimal("400"), new BigDecimal("420"), new BigDecimal("50"), new BigDecimal("999")};
        assertArrayEquals(expected, mySimpleList.getBigDecimalList());
    }

    @Test
    public void shouldGetTheRightElement() {
        BigDecimal[] numbers = {new BigDecimal("400"), new BigDecimal("50"), new BigDecimal("999")};
        BigDecimalList mySimpleList = new BigDecimalList(numbers);
        Object result = mySimpleList.get(2);
        BigDecimal expected = BigDecimal.valueOf(999);
        assertEquals(expected, result);
    }
}
