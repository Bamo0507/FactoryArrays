//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

/**
 * Implementación de una lista simple.
 *
 * @param <Integer> El tipo de elementos que contendrá la lista.
 */
public class ListaSimple<Integer> implements ListaInterface<Integer> {
    private Nodo<Integer> elementos;

    /**
     * Constructor para inicializar una lista simple vacía.
     */
    public ListaSimple() {
        this.elementos = null;
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return elementos == null;
    }

    /**
     * Agrega un elemento al principio de la lista.
     *
     * @param elemento el elemento a agregar.
     */
    @Override
    public void push(Integer elemento) {
        // Crea un nuevo nodo con el elemento y lo enlaza al principio de la lista
        Nodo<Integer> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.setSiguiente(elementos);
        elementos = nuevoNodo;
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
        // Obtiene el elemento del primer nodo y elimina el nodo de la lista
        Integer elemento = elementos.getElemento();
        elementos = elementos.getSiguiente();
        return elemento;
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
        // Devuelve el elemento del primer nodo sin eliminarlo
        return elementos.getElemento();
    }
}
