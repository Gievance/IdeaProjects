package com.SynchronizedDemo;

public class Demo {
    public static void main(String[] args) {

        Syn01 s = new Syn01();
        Thread t1 = new Thread(s,"t1");
        Thread t2 = new Thread(s,"t2");
        t1.start();
        t2.start();
    }
}
