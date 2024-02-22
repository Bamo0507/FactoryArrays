//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de una pila utilizando una lista.
 *
 * @param <Integer> El tipo de elementos que contendrá la pila.
 */
public class ListaStack<Integer> implements PilaInterface<Integer> {

    private List<Integer> elementos;

    /**
     * Constructor para inicializar una lista vacía.
     */
    public ListaStack() {
        this.elementos = new ArrayList<>(); // Inicializa la lista en el constructor
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return elementos.isEmpty(); // Devuelve true si la lista está vacía, false de lo contrario
    }

    /**
     * Agrega un elemento al principio de la lista.
     *
     * @param elemento el elemento a agregar.
     */
    @Override
    public void push(Integer elemento) {
        elementos.add(elemento); // Agrega el elemento al final de la lista
    }

    /**
     * Elimina y devuelve el elemento en la parte superior de la lista.
     *
     * @return el elemento en la parte superior de la lista.
     * @throws IllegalStateException si la lista está vacía.
     */
    @Override
    public Integer pop() {
        // Si la lista está vacía, lanza una excepción
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        // Elimina y devuelve el último elemento de la lista
        return elementos.remove(elementos.size() - 1);
    }

    /**
     * Devuelve el elemento en la parte superior de la lista sin eliminarlo.
     *
     * @return el elemento en la parte superior de la lista.
     * @throws IllegalStateException si la lista está vacía.
     */
    @Override
    public Integer top() {
        // Si la lista está vacía, lanza una excepción
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        // Devuelve el último elemento de la lista
        return elementos.get(elementos.size() - 1);
    }
}
