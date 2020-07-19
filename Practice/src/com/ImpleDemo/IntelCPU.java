package com.ImpleDemo;

import com.Type.CPU;

public class IntelCPU extends CPU {
    public IntelCPU(String Name, int price, String coretype) {
        super(Name, price, coretype);
    }

    @Override
    public void work() {
        System.out.println("IntelCPU正在工作");
    }
}
