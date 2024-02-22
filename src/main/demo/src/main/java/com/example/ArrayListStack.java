//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;
import java.util.ArrayList;

/**
 * Implementación de una pila utilizando un ArrayList.
 * Esta clase implementa la interfaz PilaInterface.
 *
 * @param <Integer> Tipo de los elementos almacenados en la pila.
 */
public class ArrayListStack<Integer> implements PilaInterface<Integer> {

    // ArrayList que almacenará los elementos de la pila
    private ArrayList<Integer> elemStack = new ArrayList<Integer>();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return elemStack.isEmpty();
    }

    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param elemento Elemento a ser agregado a la pila.
     */
    @Override
    public void push(Integer elemento) {
        elemStack.add(elemento);
    }

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return Elemento eliminado de la parte superior de la pila.
     * @throws IllegalStateException si la pila está vacía.
     */
    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemStack.remove(elemStack.size() - 1);
    }

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return Elemento en la parte superior de la pila.
     * @throws IllegalStateException si la pila está vacía.
     */
    @Override
    public Integer top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elemStack.get(elemStack.size() - 1);
    }
}
