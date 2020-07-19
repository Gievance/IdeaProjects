package com.ThreadDemo;
//需求：电影院买票窗口，三个窗口100张票
public class Thread06 {
    public static void main(String[] args) {
        SellTickets s1 = new SellTickets();

        Thread t1 = new Thread(s1, "一号窗口");
        Thread t2 = new Thread(s1, "二号窗口");
        Thread t3 = new Thread(s1, "三号窗口");
        t1.start();
        t2.start();
        t3.start();


    }
}
