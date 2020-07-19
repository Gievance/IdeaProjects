package com.ThreadSecurity;
//需求：生产者--奶箱--消费者

public class Producer implements Runnable{
    private Box b;
    public Producer() {
    }
    public Producer(Box b) {
        this.b=b;
    }
    @Override
    public void run() {
        for (int i=1;i<10;i++)
            b.put(i);
    }
}
