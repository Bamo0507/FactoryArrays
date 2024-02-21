package com.example;

import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorStack<T> implements PilaInterface<T> {
    // Vector que almacena los elementos de la pila
    private Vector<T> elemStack; 


    /**
     * Constructor de la clase Pila. Inicializa el Vector para almacenar los elementos.
     */
    public VectorStack(){
        this.elemStack = new Vector();
    }

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

    public void push(T numero){
        elemStack.add(numero);
    }


   /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return Elemento en la cima de la pila, o null si la pila está vacía.
     */ 
    public T pop() {
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
    public T top() {
        if (!isEmpty()) {
            // Obtiene el último elemento sin eliminarlo
            return elemStack.lastElement();
        } else{
            return null;
        }
    }
}
