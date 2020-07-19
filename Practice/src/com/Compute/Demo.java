package com.Compute;

import com.ImpleDemo.AMDCPU;
import com.ImpleDemo.Seagete;

public class Demo {
    public static void main(String[] args) {
        AMDCPU amd = new AMDCPU("AMD", 1200, "8核");
        Seagete seagete = new Seagete("Seagete", 2800, "2存");
        computer computer = new computer("Asus",amd,seagete);
        System.out.println("compute 1:"+computer.descrip());
        System.out.println(computer.price);
        System.out.println("work1 :");
        computer.work();
    }
}
