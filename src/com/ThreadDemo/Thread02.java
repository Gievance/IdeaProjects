package com.ThreadDemo;
//创建线程的方法：
// 子类实现runable接口，并重写run方法，调用时，将子类作为Thread的构造参数
public class Thread02 {
    public static void main(String[] args) {
        TestClass02 t1 = new TestClass02();
        TestClass02 t2 = new TestClass02();
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
