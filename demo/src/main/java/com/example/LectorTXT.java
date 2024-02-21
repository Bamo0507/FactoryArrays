package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LectorTXT {
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
            System.out.println("NEL VOS");
        }
        // Devolver el contenido del StringBuilder como un String
        return texto.toString();
    }
}
