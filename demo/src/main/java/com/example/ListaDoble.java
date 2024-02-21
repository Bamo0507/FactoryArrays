package com.example;

import java.util.LinkedList;

public class ListaDoble<Integer> implements ListaInterface<Integer> {
    private LinkedList<Integer> elementos;

    public ListaDoble() {
        elementos = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public void push(Integer elemento) {
        elementos.addFirst(elemento);
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.removeFirst();
    }

    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.getFirst();
    }
    
}
