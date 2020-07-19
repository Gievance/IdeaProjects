package com.ThreadDemo;
//继承Thread的子类
public class TestClass01 extends Thread{
//   重写run方法

    public TestClass01() {
    }

    public TestClass01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            System.out.println(getName()+"  "+i);
            //        Thread05
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
