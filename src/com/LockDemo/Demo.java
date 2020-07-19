package com.LockDemo;

public class Demo {
    public static void main(String[] args) {
        Lock01 lock = new Lock01();

//        线程1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.method(Thread.currentThread());
//                Thread.currentThread()返回当前线程引用
            }
        }, "t1");

//        线程2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.method(Thread.currentThread());
//                Thread.currentThread()返回当前线程引用
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
