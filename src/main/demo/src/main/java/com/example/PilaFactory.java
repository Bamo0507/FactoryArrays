//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

/**
 * Fábrica para crear instancias de pilas basadas en diferentes estructuras de datos.
 */
public class PilaFactory {
    /**
     * Crea y devuelve una instancia de la pila especificada.
     *
     * @param tipo el tipo de pila que se desea crear.
     * @return una instancia de la interfaz PilaInterface según el tipo especificado.
     * @throws IllegalArgumentException si el tipo especificado no es válido.
     */
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




