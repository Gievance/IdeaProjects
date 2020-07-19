package com.SynchronizedDemo;
//Synchronized关键字解决 数据安全
//synchronzied 三种同步 操作

public class Syn01 implements Runnable{
    private int count=0;//共享数据，此例没用到
    private static int stacount;//静态方法的共享数据
    private Object obj=new Object();//同步代码块的锁


    public synchronized void Add() throws InterruptedException {
//        非静态同步方法 ，锁为this ,synchronized(this)
        System.out.println(Thread.currentThread().getName()+"获得了锁");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"释放了锁");
    }

    public static synchronized void met() throws InterruptedException {
//        同步静态方法，锁为类名+class,synchronized(Syn01.class)
    System.out.println(Thread.currentThread().getName()+"获得了锁");
    Thread.sleep(1000);
    System.out.println(Thread.currentThread().getName()+"释放了锁");
}

    public void oldmet() throws InterruptedException {
        synchronized (obj)
        {
            System.out.println(Thread.currentThread().getName()+"获得了锁");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
    }
    @Override
    public void run() {
        try {
//            Add();
//            met();
            oldmet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
