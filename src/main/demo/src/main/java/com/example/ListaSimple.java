package com.example;

public class ListaSimple<Integer> implements ListaInterface<Integer> {
    private Nodo<Integer> elementos;

    public ListaSimple() {
        this.elementos = null;
    }

    @Override
    public boolean isEmpty() {
        return elementos == null;
    }

    @Override
    public void push(Integer elemento) {
        Nodo<Integer> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.setSiguiente(elementos);
        elementos = nuevoNodo;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        Integer elemento = elementos.getElemento();
        elementos = elementos.getSiguiente();
        return elemento;
    }

    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.getElemento();
    }
}
