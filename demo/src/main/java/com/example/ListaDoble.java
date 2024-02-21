package com.example;

import java.util.LinkedList;

public class ListaDoble<T> implements ListaInterface<T> {
    private LinkedList<T> elementos;

    public ListaDoble() {
        elementos = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public void push(T elemento) {
        elementos.addFirst(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.removeFirst();
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.getFirst();
    }
    
}
