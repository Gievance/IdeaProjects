package com.Stream流;

import java.util.ArrayList;

public class Stream练习1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("张曼玉");
        arr.add("张学友");
        arr.add("小白龙");
        arr.add("可爱多");

        ArrayList<String> zhang = new ArrayList<>();
        for(String s:arr)
        {
            if(s.startsWith("张"))
                zhang.add(s);
        }
        ArrayList<String> zhangsan = new ArrayList<>();
        for(String s:zhang)
        {
            if(s.length()==3)
                zhangsan.add(s);
        }
        for (String s:zhangsan)
        {
            System.out.println(s);
        }
        System.out.println("------------------");
//        上述太复杂，通过Stream流优化
        arr.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);
    }
}
