package com.SetJihe;

import java.util.HashSet;
import java.util.Set;

public class hashSetDemo {
    public static void main(String[] args) {
//        Set :元素不重复。没有索引，故无法使用普通for
//        HashSet 基于哈希数据结构
        Set<String> set=new HashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("BABY");
        for(String i:set)
        {
            System.out.println(i);
        }

    }
}
