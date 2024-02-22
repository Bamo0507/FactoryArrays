//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

import java.util.LinkedList;

/**
 * Implementación de una lista doblemente enlazada.
 *
 * @param <Integer> Tipo de los elementos de la lista.
 */
public class ListaDoble<Integer> implements ListaInterface<Integer> {
    private LinkedList<Integer> elementos;

    /**
     * Constructor de la lista doblemente enlazada.
     */
    public ListaDoble() {
        elementos = new LinkedList<>();
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param elemento El elemento a agregar.
     */
    @Override
    public void push(Integer elemento) {
        elementos.addFirst(elemento);
    }

    /**
     * Elimina y devuelve el elemento al inicio de la lista.
     *
     * @return El elemento eliminado.
     * @throws IllegalStateException Si la lista está vacía.
     */
    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        return elementos.removeFirst();
    }

    /**
     * Devuelve el elemento al inicio de la lista sin eliminarlo.
     *
     * @return El elemento al inicio de la lista.
     * @throws IllegalStateException Si la lista está vacía.
     */
    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        return elementos.getFirst();
    }
}
