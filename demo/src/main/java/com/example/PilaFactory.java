package com.example;

public class PilaFactory {
    public static PilaInterface<Integer> crearLista(String tipo) {
        switch (tipo.toUpperCase()) {
            case "VECTOR":
                return new VectorStack();
            case "ARRAY_LIST":
                return new ArrayListStack();
            case "LISTA_STACK":
                return new ListaStack();
            default:
                throw new IllegalArgumentException("Tipo de lista no válido: " + tipo);
        }
    }
}




