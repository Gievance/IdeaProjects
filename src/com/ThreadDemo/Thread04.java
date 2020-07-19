package com.ThreadDemo;
//设置和获取线程的优先级
public class Thread04 {
    public static void main(String[] args) {
        TestClass01 t1 = new TestClass01();
        TestClass01 t2 = new TestClass01();

        t1.setName("曹操");
        t2.setName("刘备");

//设置优先级
        t1.setPriority(6);
        t2.setPriority(1);
//        System.out.println(t1.getPriority());//默认优先级=5
//        System.out.println(t2.getPriority());
//        System.out.println(Thread.MAX_PRIORITY);//10
//        System.out.println(Thread.MIN_PRIORITY);//1
        t1.start();
        t2.start();

    }
}
