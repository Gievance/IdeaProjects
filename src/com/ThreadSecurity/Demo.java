package com.ThreadSecurity;
//需求：生产者--奶箱--消费者
public class Demo {
    public static void main(String[] args) {
        Box b=new Box();

        Consumer c = new Consumer(b);
        Producer p = new Producer(b);

        Thread t1 = new Thread(c, "消费者");
        Thread t2 = new Thread(p, "生产者");
        t1.start();
        t2.start();
    }
}
