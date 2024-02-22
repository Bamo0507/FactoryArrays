# Calculadora ADT

Este proyecto implementa una calculadora que evalúa expresiones aritméticas en notación infija y realiza cálculos utilizando diferentes estructuras de datos abstractas (ADT) como pilas y listas.

## Descripción

La calculadora proporciona las siguientes características:

- Conversión de expresiones de notación infija a postfija.
- Evaluación de expresiones postfijas utilizando diferentes implementaciones de pilas y listas.
- Soporte para operaciones aritméticas básicas: suma, resta, multiplicación y división.

## Estructuras de datos

El proyecto utiliza las siguientes estructuras de datos abstractas (ADT):

- Pila (implementada con vector, ArrayList y listas enlazadas)
- Lista (implementada con listas simples y doblemente enlazadas)

## Contenido del Repositorio

- **src/main/java/com/example**: Contiene todas las clases fuente del proyecto.
- **datos.txt**: Archivo de texto con expresiones aritméticas en notación infija para ser evaluadas.
- **README.md**: Este archivo que proporciona información sobre el proyecto.

## Ejecución

Para ejecutar la calculadora, sigue estos pasos:

1. Clona el repositorio en tu máquina local.
2. Asegúrate de tener Java instalado en tu sistema.
3. Compila todas las clases Java.
4. Ejecuta la clase `Main` para comenzar la calculadora.

## Ventajas y Desventajas de usar Singlenton

Ventajas:
- Permite hacer uso de una única instancia en toda la aplicación.
- Se tiene acceso global a la instancia, facilita su acceso desde cualquier punto.
- Se mejora el uso de memoria al evitar estar creando objetos constantemente.
- Aumenta la eficiencia, al solo tener que crear el objeto una vez.

Desventajas:
- Al ser global, puede presentar algunos problemas al estar haciendo pruebas unitarias.
- Se tiene que tener cuidado con su implementación, pues, se pueden presentar casos en los que necesitemos varios objetos, cada uno con información única, y el Singlenton lo impediría.

¿Fue adecuado su uso para el programa?
- El equipo considera que sí lo fue, pues al ser una variable global, nos permitía realizar cálculos desde cualquier punto sin necesidad de tener que crear una instancia de manera constante, esto mejoraba el rendimiento del programa y su eficiencia.
- Al ser un objeto que no se utilizaba para almacenar información distintiva, si no que sólo hacía cálculos, aplicarle el patrón de diseño de Singlenton quedaba perfecto, pues con tener una calculadora global se podían llevar todos los procesos a cabo.
