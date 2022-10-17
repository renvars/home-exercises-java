package advanced.test;

import advanced.test.Exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestExercise2 {
    @Test
    public void testBasketRemoveAndAdd() {
        ArrayList<Mushroom> testList = new ArrayList<>();
        Mushroom m1 = new Mushroom();
        Mushroom m2 = new Mushroom();
        testList.add(m1);
        Basket<Mushroom> basket = new Basket<>(testList);
        basket.addToBasket(m2);
        Assertions.assertEquals(2, basket.getCount());
        basket.removeFromBasket(m2);
        Assertions.assertEquals(1, basket.getCount());
    }

    @Test
    public void emptyException() {
        Basket<Apple> basket = new Basket<>();
        BasketEmptyException exception = Assertions.assertThrows(BasketEmptyException.class, () -> {
            basket.removeFromBasket(new Apple());
        });
    }

    @Test
    public void fullException() {
        ArrayList<Apple> testList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            testList.add(new Apple());
        }
        Basket<Apple> basket = new Basket<>(testList);
        BasketFullException exception = Assertions.assertThrows(BasketFullException.class, () -> {
            basket.addToBasket(new Apple());
        });
    }


}
