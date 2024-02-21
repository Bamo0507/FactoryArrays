package com.example;

public interface ListaInterface<T> {
    boolean isEmpty();
    void push(T elemento);
    T pop();
    T top();
}
