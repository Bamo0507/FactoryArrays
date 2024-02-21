package com.example;
import java.io.*;
import java.util.Scanner;

public class Main {
    private static PilaFactory pilaFactory = new PilaFactory();
    public static void main(String[] args) {
        LectorTXT txt = new LectorTXT();
        System.out.println(txt.leerTexto("datos.txt"));

        Calculadora calculadora1 = new Calculadora();
        ConvertidorInfixToPostfix conv = new ConvertidorInfixToPostfix();

        String operacion = conv.infixToPostfix();
        String tipoADT = "STACK";
        String ADT = "ARRAY_LIST";

        System.out.println(calculadora1.calcular(operacion, ADT, tipoADT));

    }
}