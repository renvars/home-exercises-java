package advanced.test;

import advanced.test.Exercise2.Apple;
import advanced.test.Exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestExercise3 {
    @Test
    public void simpleIntegers() {
        Joiner joiner = new Joiner("+");
        Integer[] ints = {1, 2, 3, 4};
        String res = joiner.join(ints);
        String expected = "1+2+3+4";
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void mixOfTypes() {
        Joiner joiner = new Joiner("---");
        Object[] someTypes = {"Morgoth", 5, 99999, new BigDecimal("420")};
        String res = joiner.join(someTypes);
        String expected = "Morgoth---5---99999---420";
        Assertions.assertEquals(expected, res);
    }
}
