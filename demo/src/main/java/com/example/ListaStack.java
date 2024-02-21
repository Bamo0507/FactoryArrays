package com.example;

import java.util.List;

public class ListaStack<T> implements PilaInterface<T> {

    private List<T> elementos;

    @Override
    public boolean isEmpty() {
        if(elementos == null){
            return true; //Devuelve verdadero si sí está vacío
        } else {
            return false; //Devuelve falso si no está vacío
        }
    }

    @Override
    public void push(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }
 
}
