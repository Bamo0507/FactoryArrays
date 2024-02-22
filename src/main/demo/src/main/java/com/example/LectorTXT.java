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
import java.util.StringTokenizer;

/**
 * Clase para leer texto desde un archivo.
 */
public class LectorTXT {

    /**
     * Lee el contenido de un archivo de texto y lo devuelve como una cadena de texto.
     *
     * @param archivo El nombre del archivo de texto a leer.
     * @return El contenido del archivo de texto como una cadena de texto.
     */
    public static String leerTexto(String archivo) {
        StringBuilder texto = new StringBuilder();
        // Se intenta leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Se lee cada una de las líneas del archivo
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en tokens (palabras)
                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {
                    // Agregar cada token al StringBuilder, separado por un espacio
                    texto.append(st.nextToken()).append(" ");
                }
            }
        } catch (IOException e) {
            // Si ocurre un error de lectura, imprimir el error
            e.printStackTrace();
            System.out.println("Error al leer el archivo: " + archivo);
        }
        // Devolver el contenido del StringBuilder como una cadena de texto
        return texto.toString();
    }
}

