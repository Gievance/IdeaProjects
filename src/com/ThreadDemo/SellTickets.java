package com.ThreadDemo;

public class SellTickets implements Runnable{
    private int ticket=100;
    private Object obj=new Object();//同一把锁

    @Override
    public void run() {
        while(true)
        {synchronized (obj) {//利用同步代码块使其同一时间只执行一个线程
//            一个线程抢到执行权，同时它也给同步代码块上了锁，别的线程执行不了
            
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket);
                ticket--;
                System.out.println("------正在出票-----");
                try {
                    Thread.sleep(100);//sleep会让线程失去执行权
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        }
    }
}
