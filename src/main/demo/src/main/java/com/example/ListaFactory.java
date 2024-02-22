//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

/**
 * Factory para crear instancias de listas.
 */
public class ListaFactory {
    /**
     * Método estático para crear instancias de listas basado en el tipo especificado.
     *
     * @param tipo El tipo de lista a crear.
     * @return Una instancia de la lista especificada.
     * @throws IllegalArgumentException Si se proporciona un tipo de lista no válido.
     */
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
