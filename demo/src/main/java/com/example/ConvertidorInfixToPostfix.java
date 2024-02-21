package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class ConvertidorInfixToPostfix {
    private static String infix;

    public ConvertidorInfixToPostfix(){
        this.infix = leerTexto("datos.txt");
    }

    public static String infixToPostfix() {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (char caracter : infix.toCharArray()) {
            if (Character.isDigit(caracter)) {
                postfix.append(caracter);
            } else if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfix.append(pila.pop());
                }
                pila.pop(); // Sacar el '('
            } else {
                while (!pila.isEmpty() && obtenerPrecedencia(caracter) <= obtenerPrecedencia(pila.peek())) {
                    postfix.append(pila.pop());
                }
                pila.push(caracter);
            }
        }

        while (!pila.isEmpty()) {
            postfix.append(pila.pop());
        }

        return postfix.toString();
    }

    private static int obtenerPrecedencia(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        }
        return 0; // Para '('
    }

    // Método para extraer los elementos de la primera línea y devolverlos como un String
    public static String leerTexto(String archivo) {
        StringBuilder texto = new StringBuilder();
        // Se intenta leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Se empieza a leer cada una de las líneas
            while ((linea = br.readLine()) != null) {
                // Dividir el String de manera separada
                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {
                    // Agregar cada elemento al StringBuilder
                    texto.append(st.nextToken()).append(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Devolver el contenido del StringBuilder como un String
        return texto.toString();
    }

}
