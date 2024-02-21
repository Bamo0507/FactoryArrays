package com.example;

public class ListaSimple<T> implements ListaInterface<T> {
    private Nodo<T> elementos;

    public ListaSimple() {
        this.elementos = null;
    }

    @Override
    public boolean isEmpty() {
        return elementos == null;
    }

    @Override
    public void push(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.setSiguiente(elementos);
        elementos = nuevoNodo;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T elemento = elementos.getElemento();
        elementos = elementos.getSiguiente();
        return elemento;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.getElemento();
    }
}
