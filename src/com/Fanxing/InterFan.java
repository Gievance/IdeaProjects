package com.Fanxing;

public class InterFan<T> implements ShowInterface<T> {
    @Override
    public void show(T i) {
        System.out.println(i);
    }
}
