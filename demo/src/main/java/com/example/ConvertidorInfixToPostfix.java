package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class ConvertidorInfixToPostfix {
    private static String infix;
    private static LectorTXT lectortxt = new LectorTXT();

    public ConvertidorInfixToPostfix(){
        this.infix = lectortxt.leerTexto("datos.txt");
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
        System.out.println(postfix.toString());
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

}
