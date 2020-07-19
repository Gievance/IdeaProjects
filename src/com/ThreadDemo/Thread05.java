package com.ThreadDemo;
//线程控制
public class Thread05 {
    public static void main(String[] args) throws InterruptedException {
        TestClass01 t1 = new TestClass01("曹操");
        TestClass01 t2 = new TestClass01("刘备");
        TestClass01 t3 = new TestClass01("诸葛亮");

        Thread.currentThread().setName("张飞");
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t1.start();
//        t1.join();
        t2.start();
        t3.start();
        for (int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
