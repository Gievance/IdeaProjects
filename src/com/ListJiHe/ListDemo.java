package com.ListJiHe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //List 有序+可重复+索引

        List<String> list=new ArrayList<String>();
        list.add("String") ;
        list.add("方法");
        list.add("迭代器遍历");
        list.add("String");
        Iterator<String> it=list.iterator();
        while (it.hasNext())
        {
            String s=it.next();
            System.out.println(s);
        }
    }
}
