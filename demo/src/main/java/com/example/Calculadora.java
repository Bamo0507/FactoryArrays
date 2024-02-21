package com.example;

import java.util.ArrayList;
import java.util.Vector;

public class Calculadora {
    
    private static ListaFactory listaFactory = new ListaFactory();
    private static PilaFactory pilaFactory = new PilaFactory();

    // Método para verificar si un carácter es un dígito
    public static boolean esDigito(char caracter) {
        return Character.isDigit(caracter);
    }

    public static ArrayList<String> Separacion(String texto) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < texto.length(); i++) {
            // Convertir cada carácter en una cadena y agregarlo al ArrayList
            strings.add(String.valueOf(texto.charAt(i)));
        }
        return strings;
    }

    public static int calcular(String Postfix, String seleccion, String tipoADT){
        
        ArrayList<String> texto = Separacion(Postfix);

        //Se crean las variables ha implementar
        int resultado = 0;
        boolean operadorValido = true;
        int contadorDigitos = 0;
        int contadorOperandos = 0;

        if (tipoADT.equals("STACK")){
            PilaInterface adt = pilaFactory.crearLista(seleccion);
            
            // Contamos la cantidad de dígitos y operandos
            for(String elemento: texto){
                for(char c: elemento.toCharArray()){
                    if(esDigito(c)){
                        contadorDigitos++;
                    } else{
                        contadorOperandos++;
                    }
                }
            }
            // Verificamos si la cantidad de dígitos es uno más que la de operandos
            if(contadorDigitos - contadorOperandos == 1){
                for(String elemento: texto){
                    //Verifica que no se encuentre un operador que no sea válido
                    if(!operadorValido){
                        break;
                    }
                    //Se recorren todos los elementos una vez más para hacer las operaciones
                    for(char caracter: elemento.toCharArray()){
                        //Si es un dígito lo pushea al Vector de la clase Pila
                        if(esDigito(caracter)){
                            adt.push(Integer.parseInt(String.valueOf(caracter)));
                        } else{ //De lo contrario, si se topa con una operador, llama a los 2 números de encima, y hace la operación
                            System.out.println("--------------------");
                            int val1 = adt.pop();
                            System.out.println("Primer valor tomado: " + val1);
                            int val2 = adt.pop();
                            System.out.println("Segundo valor tomado: " + val2);
                            System.out.println("Operacion a Hacer: " + caracter);
                            System.out.println("--------------------");
                            //Decide la operación correcta a emplear
                            if(caracter == '+'){
                                resultado = val2 + val1;
                                adt.push(resultado);
                            } else if(caracter == '-'){
                                resultado = val2 - val1;
                                adt.push(resultado);
                            } else if(caracter == '*'){
                                resultado = val2 * val1;
                                adt.push(resultado);
                            } else if(caracter == '/'){
                                //Validación para división por 0
                                if(val1 == 0){
                                    System.out.println("Se reemplazará el 0 por un 1, ya que no se puede dividir por 0.");
                                    val1 = 1;
                                }
                                resultado = val2/val1;
                                adt.push(resultado);
                            } else{ //Validación si se encuentra un signo no válido
                                System.out.println("Ha ingresado un operador no válido :(");
                                System.out.println("Se procederá a darle el resultado actual, revise su expresión.");
                                operadorValido = false;
                            }
                            System.out.println("RESULTADO: " + resultado);
                            System.out.println("--------------------");
                            System.out.println();
                        }
                    }
                }
            } else{
                System.out.println("No se cuenta con la cantidad adecuada de dígitos u operadores.");
            }
        } else if(tipoADT.equals("LISTA")){
            ListaInterface adt = listaFactory.crearLista(seleccion);
                
            // Contamos la cantidad de dígitos y operandos
            for(String elemento: texto){
                for(char c: elemento.toCharArray()){
                    if(esDigito(c)){
                        contadorDigitos++;
                    } else{
                        contadorOperandos++;
                    }
                }
            }
            // Verificamos si la cantidad de dígitos es uno más que la de operandos
            if(contadorDigitos - contadorOperandos == 1){
                for(String elemento: texto){
                    //Verifica que no se encuentre un operador que no sea válido
                    if(!operadorValido){
                        break;
                    }
                    //Se recorren todos los elementos una vez más para hacer las operaciones
                    for(char caracter: elemento.toCharArray()){
                        //Si es un dígito lo pushea al Vector de la clase Pila
                        if(esDigito(caracter)){
                            adt.push(Integer.parseInt(String.valueOf(caracter)));
                        } else{ //De lo contrario, si se topa con una operador, llama a los 2 números de encima, y hace la operación
                            System.out.println("--------------------");
                            int val1 = adt.pop();
                            System.out.println("Primer valor tomado: " + val1);
                            int val2 = adt.pop();
                            System.out.println("Segundo valor tomado: " + val2);
                            System.out.println("Operacion a Hacer: " + caracter);
                            System.out.println("--------------------");
                            //Decide la operación correcta a emplear
                            if(caracter == '+'){
                                resultado = val2 + val1;
                                adt.push(resultado);
                            } else if(caracter == '-'){
                                resultado = val2 - val1;
                                adt.push(resultado);
                            } else if(caracter == '*'){
                                resultado = val2 * val1;
                                adt.push(resultado);
                            } else if(caracter == '/'){
                                //Validación para división por 0
                                if(val1 == 0){
                                    System.out.println("Se reemplazará el 0 por un 1, ya que no se puede dividir por 0.");
                                    val1 = 1;
                                }
                                resultado = val2/val1;
                                adt.push(resultado);
                            } else{ //Validación si se encuentra un signo no válido
                                System.out.println("Ha ingresado un operador no válido :(");
                                System.out.println("Se procederá a darle el resultado actual, revise su expresión.");
                                operadorValido = false;
                            }
                            System.out.println("RESULTADO: " + resultado);
                            System.out.println("--------------------");
                            System.out.println();
                        }
                    }
                }
            } else{
                System.out.println("No se cuenta con la cantidad adecuada de dígitos u operadores.");
            }
        }

        return resultado;
    }
}
