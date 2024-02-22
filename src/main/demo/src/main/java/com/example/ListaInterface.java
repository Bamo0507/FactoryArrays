//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

/**
 * Interfaz para definir el comportamiento de una lista.
 *
 * @param <T> El tipo de elementos que contendrá la lista.
 */
public interface ListaInterface<T> {
    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario.
     */
    boolean isEmpty();

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param elemento El elemento a agregar.
     */
    void push(T elemento);

    /**
     * Elimina y devuelve el elemento en la parte superior de la lista.
     *
     * @return El elemento eliminado de la lista.
     * @throws IllegalStateException si la lista está vacía.
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la lista sin eliminarlo.
     *
     * @return El elemento en la parte superior de la lista.
     * @throws IllegalStateException si la lista está vacía.
     */
    T top();
}
