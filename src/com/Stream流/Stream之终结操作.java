package com.Stream流;

import java.util.ArrayList;

//void forEach(Consumer<? super T> action) 对此流的每个元素执行操作。
//long 	count()   返回此流中元素的数量。
public class Stream之终结操作 {
    public static void main(String[] args) {
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("10");
        arr2.add("20");
        arr2.add("30");
        arr2.add("40");
        arr2.add("50");
        long count = arr2.stream().filter(i -> Integer.parseInt(i) >= 20).count();
        System.out.println(count);
    }
}
