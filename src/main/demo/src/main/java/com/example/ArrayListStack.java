package com.example;
import java.util.ArrayList;

public class ArrayListStack<Integer> implements PilaInterface<Integer> {
    private ArrayList<Integer> elemStack = new ArrayList<Integer>();

    @Override
    public boolean isEmpty() {
        return elemStack.isEmpty();
    }

    @Override
    public void push(Integer elemento) {
        elemStack.add(elemento);
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemStack.remove(elemStack.size() - 1);
    }

    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemStack.get(elemStack.size() - 1);
    }
}
