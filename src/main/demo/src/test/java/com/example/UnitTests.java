package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.ArrayList;


public class UnitTests {

    private static Calculadora calculadora = new Calculadora();
    private ArrayListStack<Integer> pila = new ArrayListStack();
    private ListaStack<Integer> listaStack = new ListaStack<>();
    private ListaSimple<Integer> listaSimple = new ListaSimple<>();
    private ListaDoble<Integer> listaDoble = new ListaDoble<>();

    @Test
    public void testEsDigito() {
        assertTrue(Calculadora.esDigito('5'));
        assertFalse(Calculadora.esDigito('+'));
    }

    @Test
    public void testSeparacion() {
        ArrayList<String> resultado = Calculadora.Separacion("3+5");
        assertEquals(3, resultado.size());
        assertEquals("3", resultado.get(0));
        assertEquals("+", resultado.get(1));
        assertEquals("5", resultado.get(2));
    }

    @Test
    public void testCalcular() {
        String postfix = "34+";
        String seleccion = "VECTOR";
        String tipoADT = "STACK";

        int resultado = calculadora.calcular(postfix, seleccion, tipoADT);
        assertEquals(7, resultado);
    }

    @Test
    public void testCalcularConLista() {
        String postfix = "35+";
        String tipoADT = "LISTA"; // Ajustar según la implementación real
        String seleccion = "LISTA_SIMPLE";

        int resultado = Calculadora.calcular(postfix, seleccion, tipoADT);
        System.out.println(resultado);
        assertEquals(8, resultado);
    }

    @Test
    public void testArrayListStack() {
        // Verifica si la pila está vacía al inicio
        assertTrue(pila.isEmpty());

        // Agrega elementos a la pila y verifica si la pila ya no está vacía
        pila.push(5);
        assertFalse(pila.isEmpty());

        // Verifica que el elemento en la parte superior de la pila sea el último agregado
        assertEquals(Integer.valueOf(5), pila.top());

        // Agrega más elementos a la pila
        pila.push(10);
        pila.push(15);

        // Verifica que al hacer pop, los elementos se retiren correctamente y en el orden adecuado
        assertEquals(Integer.valueOf(15), pila.pop());
        assertEquals(Integer.valueOf(10), pila.pop());
        assertEquals(Integer.valueOf(5), pila.pop());

        // Verifica que la pila esté vacía nuevamente después de hacer pop en todos los elementos
        assertTrue(pila.isEmpty());

        // Verifica que lanzar una excepción al hacer pop en una pila vacía
        try {
            pila.pop();
            fail("Se esperaba una IllegalStateException al hacer pop en una pila vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }

        // Verifica que lanzar una excepción al hacer top en una pila vacía
        try {
            pila.top();
            fail("Se esperaba una IllegalStateException al hacer top en una pila vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testListaStack() {
        // Verifica si la pila está vacía al inicio
        assertTrue(listaStack.isEmpty());

        // Agrega elementos a la pila y verifica si la pila ya no está vacía
        listaStack.push(5);
        assertFalse(listaStack.isEmpty());

        // Verifica que el elemento en la parte superior de la pila sea el último agregado
        assertEquals(Integer.valueOf(5), listaStack.top());

        // Agrega más elementos a la pila
        listaStack.push(10);
        listaStack.push(15);

        // Verifica que al hacer pop, los elementos se retiren correctamente y en el orden adecuado
        assertEquals(Integer.valueOf(15), listaStack.pop());
        assertEquals(Integer.valueOf(10), listaStack.pop());
        assertEquals(Integer.valueOf(5), listaStack.pop());

        // Verifica que la pila esté vacía nuevamente después de hacer pop en todos los elementos
        assertTrue(listaStack.isEmpty());

        // Verifica que lanzar una excepción al hacer pop en una pila vacía
        try {
            listaStack.pop();
            fail("Se esperaba una IllegalStateException al hacer pop en una pila vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }

        // Verifica que lanzar una excepción al hacer top en una pila vacía
        try {
            listaStack.top();
            fail("Se esperaba una IllegalStateException al hacer top en una pila vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testListaSimple() {
        // Verifica si la lista está vacía al inicio
        assertTrue(listaSimple.isEmpty());

        // Agrega elementos a la lista y verifica si la lista ya no está vacía
        listaSimple.push(5);
        assertFalse(listaSimple.isEmpty());

        // Verifica que el elemento en la parte superior de la lista sea el último agregado
        assertEquals(Integer.valueOf(5), listaSimple.top());

        // Agrega más elementos a la lista
        listaSimple.push(10);
        listaSimple.push(15);

        // Verifica que al hacer pop, los elementos se retiren correctamente y en el orden adecuado
        assertEquals(Integer.valueOf(15), listaSimple.pop());
        assertEquals(Integer.valueOf(10), listaSimple.pop());
        assertEquals(Integer.valueOf(5), listaSimple.pop());

        // Verifica que la lista esté vacía nuevamente después de hacer pop en todos los elementos
        assertTrue(listaSimple.isEmpty());

        // Verifica que lanzar una excepción al hacer pop en una lista vacía
        try {
            listaSimple.pop();
            fail("Se esperaba una IllegalStateException al hacer pop en una lista vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }

        // Verifica que lanzar una excepción al hacer top en una lista vacía
        try {
            listaSimple.top();
            fail("Se esperaba una IllegalStateException al hacer top en una lista vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testListaDoble() {
        // Verifica si la lista está vacía al inicio
        assertTrue(listaDoble.isEmpty());

        // Agrega elementos a la lista y verifica si la lista ya no está vacía
        listaDoble.push(5);
        assertFalse(listaDoble.isEmpty());

        // Verifica que el elemento en la parte superior de la lista sea el último agregado
        assertEquals(Integer.valueOf(5), listaDoble.top());

        // Agrega más elementos a la lista
        listaDoble.push(10);
        listaDoble.push(15);

        // Verifica que al hacer pop, los elementos se retiren correctamente y en el orden adecuado
        assertEquals(Integer.valueOf(15), listaDoble.pop());
        assertEquals(Integer.valueOf(10), listaDoble.pop());
        assertEquals(Integer.valueOf(5), listaDoble.pop());

        // Verifica que la lista esté vacía nuevamente después de hacer pop en todos los elementos
        assertTrue(listaDoble.isEmpty());

        // Verifica que lanzar una excepción al hacer pop en una lista vacía
        try {
            listaDoble.pop();
            fail("Se esperaba una IllegalStateException al hacer pop en una lista vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }

        // Verifica que lanzar una excepción al hacer top en una lista vacía
        try {
            listaDoble.top();
            fail("Se esperaba una IllegalStateException al hacer top en una lista vacía");
        } catch (IllegalStateException e) {
            // Excepción esperada
        }
    }
}
