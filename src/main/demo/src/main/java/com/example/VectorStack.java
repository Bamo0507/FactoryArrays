//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorStack implements PilaInterface<Integer> {
    // Vector que almacena los elementos de la pila
    private Vector<Integer> elemStack = new Vector<Integer>(); 

    /** 
     * @return boolean
     */
    //Verificar si está llenó o vacío   
    public boolean isEmpty(){
        if(elemStack == null){
            return true; //Devuelve verdadero si sí está vacío
        } else {
            return false; //Devuelve falso si no está vacío
        }
    }

    //Método para meter valores al Vector
    /**
     * Inserta un elemento en la cima de la pila.
     *
     * @param numero Elemento a ser insertado en la pila.
     */

    public void push(Integer numero){
        elemStack.add(numero);
    }


   /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return Elemento en la cima de la pila, o null si la pila está vacía.
     */ 
    public Integer pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elemStack.remove(elemStack.size() - 1);
    }

    /**
     * Obtiene el elemento en la cima de la pila sin eliminarlo.
     *
     * @return Elemento en la cima de la pila, o null si la pila está vacía.
     */
    public Integer top() {
        if (!isEmpty()) {
            // Obtiene el último elemento sin eliminarlo
            return elemStack.lastElement();
        } else{
            return null;
        }
    }
}
