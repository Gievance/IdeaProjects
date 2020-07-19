package com.函数式接口;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inter01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        arrayList.add("101112");
        System.out.println(arrayList);
        Collections.sort(arrayList,getCom());
        System.out.println(arrayList);
    }
//    函数式接口作为返回值
    public static Comparator<String> getCom(){
//        匿名
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };

    }
}
