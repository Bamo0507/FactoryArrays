package com.example;
import java.util.Scanner;

public class Main {
    private static PilaFactory pilaFactory = new PilaFactory();
    private static ListaFactory listaFactory = new ListaFactory();
    private static boolean systemON = true;
    private static Scanner sc = new Scanner(System.in);
    private static String tipoADT;
    private static String adt;
    public static void main(String[] args) {
        System.out.println("***********************************************************");
        System.out.println("*  __        _______ _     ____ ___  __  __ _____ _ _ _   *");
        System.out.println("*  \\ \\      / / ____| |   / ___/ _ \\|  \\/  | ____| | | |  *");
        System.out.println("*   \\ \\ /\\ / /|  _| | |  | |  | | | | |\\/| |  _| | | | |  *");
        System.out.println("*    \\ V  V / | |___| |__| |__| |_| | |  | | |___|_|_|_|  *");
        System.out.println("*     \\_/\\_/  |_____|_____\\____\\___/|_|  |_|_____(_|_|_)  *");
        System.out.println("***********************************************************");
        System.out.println("\nBuen día querido usuario ;)\n");

        while(systemON){
            System.out.println("~~~~~~~~~~~~~~  ~~~~~~~~~~~  ~~~~~~~~~~  ~~~~~~~~~~  ~~~~~~~~~~~~");
            System.out.println("¿Qué tipo de ADT desea utilizar?");
        }
        System.out.println("1. Pila\n" + "2. Lista\n" + "3. Salir del programa\n");
        String seleccion = sc.nextLine();
        switch(seleccion){
            case "1":

        }
    }
}