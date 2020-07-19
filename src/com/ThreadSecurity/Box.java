package com.ThreadSecurity;
//需求：生产者--牛奶箱--消费者
public class Box {
    private int milk;
//   false代表奶箱没有奶
    private boolean state=false;

    public synchronized void put(int milk)
    {
        if(state)
        {//state==true 代表奶箱有奶
            try {
                wait();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
//            进入等待后，自然不执行下面步骤
        }
        this.milk=milk;
        System.out.println(Thread.currentThread().getName()+"正在生产第"+this.milk+"瓶奶");
        state=true;
        notify();
    }
    public synchronized void get()
    {
        if(!state)
        {
            try {
                wait();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"得到了"+this.milk+"瓶奶");
        state=false;
        notify();
    }
}
