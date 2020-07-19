package com.ListJiHe;

import java.util.ArrayList;

public class List的交集 {
    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        in.add(10);
        in.add(20);
        ArrayList<Integer> in2 = new ArrayList<>();
        in2.add(20);
        in2.add(30);

        System.out.println(in.retainAll(in2));
        System.out.println(in);//会将in 只保留20；
        System.out.println("---");
        System.out.println(in2);
    }
}
