package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.EmptyStackException;

public class PilaTests {

    @Test
    public void testArrayListStack() {
        PilaInterface<Integer> pila = new ArrayListStack<>();
        assertTrue(pila.isEmpty());

        pila.push(1);
        assertFalse(pila.isEmpty());
        assertEquals(Integer.valueOf(1), pila.top());

        assertEquals(Integer.valueOf(1), pila.pop());
        assertTrue(pila.isEmpty());

        // Probar excepción al intentar hacer pop en una pila vacía
        try {
            pila.pop();
            fail("Se esperaba EmptyStackException");
        } catch (EmptyStackException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testListaStack() {
        PilaInterface<Integer> pila = new ListaStack<>();
        assertTrue(pila.isEmpty());

        pila.push(1);
        assertFalse(pila.isEmpty());
        assertEquals(Integer.valueOf(1), pila.top());

        assertEquals(Integer.valueOf(1), pila.pop());
        assertTrue(pila.isEmpty());

        // Probar excepción al intentar hacer pop en una pila vacía
        try {
            pila.pop();
            fail("Se esperaba EmptyStackException");
        } catch (EmptyStackException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testVectorStack() {
        PilaInterface<Integer> pila = new VectorStack();
        assertTrue(pila.isEmpty());

        pila.push(1);
        assertFalse(pila.isEmpty());
        assertEquals(Integer.valueOf(1), pila.top());

        assertEquals(Integer.valueOf(1), pila.pop());
        assertTrue(pila.isEmpty());

        // Probar excepción al intentar hacer pop en una pila vacía
        try {
            pila.pop();
            fail("Se esperaba EmptyStackException");
        } catch (EmptyStackException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testListaSimple() {
        ListaInterface<Integer> lista = new ListaSimple<>();
        assertTrue(lista.isEmpty());

        lista.push(1);
        assertFalse(lista.isEmpty());
        assertEquals(Integer.valueOf(1), lista.top());

        assertEquals(Integer.valueOf(1), lista.pop());
        assertTrue(lista.isEmpty());

        // Probar excepción al intentar hacer pop en una lista vacía
        try {
            lista.pop();
            fail("Se esperaba EmptyStackException");
        } catch (EmptyStackException e) {
            // Excepción esperada
        }
    }

    @Test
    public void testListaDoble() {
        ListaInterface<Integer> lista = new ListaDoble<>();
        assertTrue(lista.isEmpty());

        lista.push(1);
        assertFalse(lista.isEmpty());
        assertEquals(Integer.valueOf(1), lista.top());

        assertEquals(Integer.valueOf(1), lista.pop());
        assertTrue(lista.isEmpty());

        // Probar excepción al intentar hacer pop en una lista vacía
        try {
            lista.pop();
            fail("Se esperaba EmptyStackException");
        } catch (EmptyStackException e) {
            // Excepción esperada
        }
    }
}
