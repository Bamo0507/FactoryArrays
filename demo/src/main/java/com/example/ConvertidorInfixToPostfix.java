package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ConvertidorInfixToPostfix {

    public static String infixToPostfix(String infix) {
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

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String operacionInfix = br.readLine();
            String operacionPostfix = infixToPostfix(operacionInfix);

            System.out.println("Infix: " + operacionInfix);
            System.out.println("Postfix: " + operacionPostfix);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
