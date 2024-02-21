package com.example;

import java.util.List;

public class ListaStack<Integer> implements PilaInterface<Integer> {

    private List<Integer> elementos;

    @Override
    public boolean isEmpty() {
        if(elementos == null){
            return true; //Devuelve verdadero si sí está vacío
        } else {
            return false; //Devuelve falso si no está vacío
        }
    }

    @Override
    public void push(Integer elemento) {
        elementos.add(elemento);
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }
 
}
