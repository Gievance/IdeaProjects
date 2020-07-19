package com.ImpleDemo;

import com.Type.Disk;

public class WesrDigital extends Disk {
    public WesrDigital(String Name, int price, String disktype) {
        super(Name, price, disktype);
    }

    @Override
    public void work() {
        System.out.println("正在调用WesrDigital 磁盘");
    }
}
