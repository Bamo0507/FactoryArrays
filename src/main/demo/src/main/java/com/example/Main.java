//Nombre: Bryan Alberto Martínez Orellana
//Carné: 23542
//Nombre: Adriana Sophia Palacios Contreras
//Carné: 23044
//Fecha de Creación: 14/02/2024
//Fecha de Última Modificacion: 21/02/2024

package com.example;

import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa de la calculadora.
 */
public class Main {
    private static PilaFactory pilaFactory = new PilaFactory();
    private static ListaFactory listaFactory = new ListaFactory();
    private static boolean systemON = true;
    private static boolean systemON2 = true;
    private static Scanner sc = new Scanner(System.in);
    private static String tipoADT;
    private static String adt;
    private static ConvertidorInfixToPostfix convert = new ConvertidorInfixToPostfix();

    /**
     * Método principal que inicia el programa de la calculadora.
     *
     * @param args los argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Obtiene la expresión postfix desde el convertidor de infix a postfix
        String postfix = convert.infixToPostfix();
        
        // Imprime el encabezado de la calculadora
        System.out.println("***********************************************************");
        System.out.println("*  __        _______ _     ____ ___  __  __ _____ _ _ _   *");
        System.out.println("*  \\ \\      / / ____| |   / ___/ _ \\|  \\/  | ____| | | |  *");
        System.out.println("*   \\ \\ /\\ / /|  _| | |  | |  | | | | |\\/| |  _| | | | |  *");
        System.out.println("*    \\ V  V / | |___| |__| |__| |_| | |  | | |___|_|_|_|  *");
        System.out.println("*     \\_/\\_/  |_____|_____\\____\\___/|_|  |_|_____(_|_|_)  *");
        System.out.println("***********************************************************");
        System.out.println("\nBuen día querido usuario ;)\n");

        while (systemON) {
            // Obtiene la instancia única de la calculadora (patrón Singleton)
            Calculadora calculadora = Calculadora.obtenerInstancia();
            
            // Menú de selección para utilizar una pila o una lista
            System.out.println("~~~~~~~~~~~~~~  ~~~~~~~~~~~  ~~~~~~~~~~  ~~~~~~~~~~  ~~~~~~~~~~~~");
            System.out.println("¿Quieres hacer uso de una Pila, o de una Pila basada en Lista?");
            System.out.println("1. Pila\n" + "2. Lista\n" + "3. Salir del programa\n");
            String seleccion = sc.nextLine();
            String seleccion2;
            systemON2 = true;
            switch (seleccion) {
                case "1":
                    tipoADT = "STACK";
                    while (systemON2) {
                        System.out.println("¿Cuál desea utilizar?");
                        System.out.println("1. Vector\n" + "2. ArrayList\n" + "3. Lista\n" + "4. Regresar al menú anterior\n");
                        seleccion2 = sc.nextLine();
                        switch (seleccion2) {
                            case "1":
                                adt = "VECTOR";
                                calculadora.calcular(postfix, adt, tipoADT);
                                break;
                            case "2":
                                adt = "ARRAY_LIST";
                                calculadora.calcular(postfix, adt, tipoADT);
                                break;
                            case "3":
                                adt = "LISTA_STACK";
                                calculadora.calcular(postfix, adt, tipoADT);
                                break;
                            case "4":
                                systemON2 = false;
                                break;
                            default:
                                System.out.println("No ha seleccionado una de las opciones dadas, vuelva a intentarlo.\n");
                                break;
                        }
                    }
                    break;
                case "2":
                    tipoADT = "LISTA";
                    while (systemON2) {
                        System.out.println("¿Cuál desea utilizar?");
                        System.out.println("1. Lista Simple\n" + "2. Lista Doblemente Enlazada\n" + "3. Regresar al menú anterior\n");
                        seleccion2 = sc.nextLine();
                        switch (seleccion2) {
                            case "1":
                                adt = "LISTA_SIMPLE";
                                calculadora.calcular(postfix, adt, tipoADT);
                                break;
                            case "2":
                                adt = "LISTA_DOBLE";
                                calculadora.calcular(postfix, adt, tipoADT);
                                break;
                            case "3":
                                systemON2 = false;
                                break;
                            default:
                                System.out.println("No ha seleccionado una de las opciones dadas, vuelva a intentarlo.\n");
                                break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Qué tenga un lindo día!!!");
                    systemON = false;
                    break;
                default:
                    System.out.println("No se ha seleccionado una de las opciones proporcionadas.");
                    break;
            }
        }
    }
}
