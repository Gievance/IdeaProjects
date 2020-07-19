package com.ImpleDemo;

import com.Type.CPU;

public class AMDCPU extends CPU {
    public AMDCPU(String Name, int price, String coretype) {
        super(Name, price, coretype);
    }

    @Override
    public void work() {
        System.out.println("正在调用AMDCPU");
    }
}
