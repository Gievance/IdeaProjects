package com.ThreadDemo;
//创建线程的方法：创建一个类继承Thread
public class Thread01 {
    public static void main(String[] args) {
        TestClass01 t1 = new TestClass01();
        TestClass01 t2 = new TestClass01();
        t1.start();
        t2.start();
    }
}
