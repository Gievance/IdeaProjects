package com.ImpleDemo;

import com.Type.Disk;

public class Seagete extends Disk {
    public Seagete(String Name, int price, String disktype) {
        super(Name, price, disktype);
    }

    @Override
    public void work() {
        System.out.println("正在调用Seagete磁盘");
    }
}
