package com.example;

public interface PilaInterface<T> {
    boolean isEmpty();
    void push(T elemento);
    T pop();
    T top();
}
