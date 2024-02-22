//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

/**
 * Clase que representa un nodo en una lista enlazada.
 *
 * @param <T> el tipo de elemento almacenado en el nodo.
 */
public class Nodo<T> {
    private T elemento; // Elemento almacenado en el nodo
    private Nodo<T> siguiente; // Referencia al siguiente nodo en la lista

    /**
     * Constructor que crea un nuevo nodo con el elemento especificado.
     *
     * @param elemento el elemento que se almacenará en el nodo.
     */
    public Nodo(T elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    /**
     * Obtiene el elemento almacenado en el nodo.
     *
     * @return el elemento almacenado en el nodo.
     */
    public T getElemento() {
        return elemento;
    }

    /**
     * Establece el elemento que se almacenará en el nodo.
     *
     * @param elemento el elemento a establecer.
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     * Obtiene el siguiente nodo en la lista.
     *
     * @return el siguiente nodo en la lista.
     */
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo en la lista.
     *
     * @param siguiente el siguiente nodo a establecer.
     */
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
