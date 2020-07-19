package com.SetJihe;

import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String[] args) {
        //需求：存入整型
        TreeSet<Integer> tre=new TreeSet<Integer>();
        tre.add(9);//自动装箱
        tre.add(12);
        tre.add(1);
        for(Integer i:tre)
        {
            System.out.println(i);
        }
//        1
//        9
//        12 ===自动排序了---无参的自然排序

    }
}
