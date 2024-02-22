//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Clase para convertir una expresión en notación infix a postfix.
 */
public class ConvertidorInfixToPostfix {

    // Expresión infix a convertir
    private static String infix;
    // Instancia del lector de archivos de texto
    private static LectorTXT lectortxt = new LectorTXT();

    /**
     * Constructor de la clase. Lee la expresión infix desde un archivo de texto.
     */
    public ConvertidorInfixToPostfix() {
        this.infix = lectortxt.leerTexto("datos.txt");
    }

    /**
     * Convierte una expresión infix a postfix.
     *
     * @return La expresión en formato postfix.
     */
    public static String infixToPostfix() {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        // Itera sobre cada carácter de la expresión infix
        for (char caracter : infix.toCharArray()) {
            // Si el carácter es un dígito, lo añade directamente al resultado postfix
            if (Character.isDigit(caracter)) {
                postfix.append(caracter);
            } else if (caracter == '(') { // Si es un paréntesis de apertura, lo añade a la pila
                pila.push(caracter);
            } else if (caracter == ')') { // Si es un paréntesis de cierre
                // Desapila y añade al resultado postfix todos los operadores hasta encontrar el paréntesis de apertura correspondiente
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfix.append(pila.pop());
                }
                pila.pop(); // Elimina el paréntesis de apertura de la pila
            } else { // Si es un operador
                // Desapila y añade al resultado postfix los operadores con precedencia mayor o igual que el actual
                while (!pila.isEmpty() && obtenerPrecedencia(caracter) <= obtenerPrecedencia(pila.peek())) {
                    postfix.append(pila.pop());
                }
                // Añade el operador actual a la pila
                pila.push(caracter);
            }
        }

        // Desapila y añade al resultado postfix los operadores restantes en la pila
        while (!pila.isEmpty()) {
            postfix.append(pila.pop());
        }
        // Devuelve la expresión postfix como una cadena de texto
        return postfix.toString();
    }

    /**
     * Obtiene la precedencia de un operador.
     *
     * @param operador El operador del cual se desea obtener la precedencia.
     * @return La precedencia del operador.
     */
    private static int obtenerPrecedencia(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        }
        return 0; // Para '('
    }
}
