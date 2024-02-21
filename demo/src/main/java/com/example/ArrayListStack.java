package com.example;
import java.util.ArrayList;

public class ArrayListStack<T> implements PilaInterface<T> {
    private ArrayList<T> elemStack = new ArrayList<T>();

    @Override
    public boolean isEmpty() {
        return elemStack.isEmpty();
    }

    @Override
    public void push(T elemento) {
        elemStack.add(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemStack.remove(elemStack.size() - 1);
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemStack.get(elemStack.size() - 1);
    }
}
