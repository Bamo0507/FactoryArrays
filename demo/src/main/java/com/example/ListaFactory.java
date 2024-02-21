package com.example;

public class ListaFactory {
    public static ListaInterface<Integer> crearLista(String tipo) {
        switch (tipo.toUpperCase()) {
            case "LISTA_SIMPLE":
                return new ListaSimple<>();
            case "LISTA_DOBLE":
                return new ListaDoble<>();
            default:
                throw new IllegalArgumentException("Tipo de lista no válido: " + tipo);
        }
    }
}