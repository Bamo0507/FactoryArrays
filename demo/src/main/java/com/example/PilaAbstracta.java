package com.example;
import java.util.Vector;


public class PilaAbstracta<T> implements PilaInterface<T> {

    private Vector<T> numeros;

    public PilaAbstracta(){
        this.numeros = new Vector<T>();
    }

    public boolean isEmpty(){
        if(numeros == null){
            return true; //Devuelve verdadero si sí está vacío
        } else {
            return false; //Devuelve falso si no está vacío
        }
    }

    public void push(T numero){
        numeros.add(numero);
    }

    public T pop() {
        if (!isEmpty()) {
            // Obtiene el último elemento
            T poppedValue = numeros.lastElement();
            // Elimina el último elemento
            numeros.remove(numeros.size() - 1);
            return poppedValue;
        }
        // Pila vacía
        return null;
    }
    
    public T top() {
        if (!isEmpty()) {
            // Obtiene el último elemento sin eliminarlo
            return numeros.lastElement();
        } else{
            return null;
        }
    }


    
}
