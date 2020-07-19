package com.ThreadSecurity;
//需求：生产者--奶箱--消费者

public class Consumer implements Runnable{
    private Box b;
    public Consumer() {
    }
    public Consumer(Box b) {
        this.b=b;
    }
    @Override
    public void run() {
        while(true)
            b.get();
    }
}
