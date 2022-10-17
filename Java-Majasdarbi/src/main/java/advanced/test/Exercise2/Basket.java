package advanced.test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<E> {
    private List<E> elements;
    private int count;

    public Basket(List<E> elements) {
        this.elements = elements;
        this.count = elements.size();
    }

    public Basket() {
        this.elements = new ArrayList<>();
        this.count = 0;
    }

    public void addToBasket(E element) {
        if (getCount() == 10) {
            throw new BasketFullException("Basket is Full!");
        }
        elements.add(element);
        setCount(getCount() + 1);
    }

    public void removeFromBasket(E element) {
        if (elements.size() == 0) {
            throw new BasketEmptyException("Basket is Empty!");
        }
        elements.remove(element);
        setCount(getCount() - 1);
    }
    //GETTERS AND SETTERS

    public void setCount(int count) {
        this.count = count;
    }

    public List<E> getElements() {
        return elements;
    }

    public int getCount() {
        return count;
    }
}
