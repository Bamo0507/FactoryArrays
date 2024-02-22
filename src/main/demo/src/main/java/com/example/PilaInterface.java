//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

/**
 * Interfaz para definir los métodos básicos que debe implementar una pila.
 *
 * @param <T> el tipo de elementos que contendrá la pila.
 */
public interface PilaInterface<T> {
    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false si no lo está.
     */
    boolean isEmpty();

    /**
     * Inserta un elemento en la parte superior de la pila.
     *
     * @param elemento el elemento a insertar.
     */
    void push(T elemento);

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return el elemento eliminado de la parte superior de la pila.
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return el elemento en la parte superior de la pila.
     */
    T top();
}
