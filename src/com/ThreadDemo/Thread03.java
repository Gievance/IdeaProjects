package com.ThreadDemo;
//设置和获取线程名称
public class Thread03 {
    public static void main(String[] args) {
//        TestClass01 t1 = new TestClass01();
//        TestClass01 t2 = new TestClass01();
//        t1.setName("线程一");
//        t2.setName("线程二");
//        t1.start();
//        t2.start();
//        父类有参构造，改name
//       public Thread(String name)
//        TestClass01 t3 = new TestClass01("飞机");
//        t3.start();
//        那么main方法的线程是什么？？
        System.out.println(Thread.currentThread().getName());
    }
}
