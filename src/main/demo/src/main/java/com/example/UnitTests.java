package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.EmptyStackException;


public class CalculadoraTest {

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
    public void testCalcularConStack() {
        String postfix = "3 5 +";
        String seleccion = "STACK";
        String tipoADT = "STACK";

        int resultado = Calculadora.calcular(postfix, seleccion, tipoADT);
        assertEquals(8, resultado);
    }

    @Test
    public void testCalcularConLista() {
        String postfix = "3 5 +";
        String seleccion = "LISTA"; // Ajustar según la implementación real
        String tipoADT = "LISTA";

        int resultado = Calculadora.calcular(postfix, seleccion, tipoADT);
        assertEquals(8, resultado);
    }

    @Test
    public void testCalcularDivisionPorCero() {
        String postfix = "5 0 /";
        String seleccion = "STACK";
        String tipoADT = "STACK";

        int resultado = Calculadora.calcular(postfix, seleccion, tipoADT);
        assertEquals(0, resultado); // Se espera que se haya reemplazado el 0 por 1
    }

    @Test
    public void testCalcularOperadorNoValido() {
        String postfix = "3 5 $"; // $ no es un operador válido
        String seleccion = "VECTOR"; // Ajustar según la implementación real
        String tipoADT = "LISTA";

        int resultado = Calculadora.calcular(postfix, seleccion, tipoADT);
        assertEquals(0, resultado); // Se espera que el resultado sea 0 debido al operador no válido
    }

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
