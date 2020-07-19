package com.StrengthenFor;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class StrenFor {
    public static void main(String[] args) {
        //增强For:简化数组和Collection遍历
        //int 数组
        int[] arr={1,2,3,4,5};
        for(int i:arr)
        {
            System.out.println(i);
        }
        //String数组

        String[] str={"Hello","World","Java"};
        for(String i:str)
        {
            System.out.println(i);
        }
        //Collection遍历
        List<String> list = new ArrayList<>();
        list.add("Bye");
        list.add("Bye2");
        list.add("Today");
        for(String i:list)
        {
            System.out.println(i);
        }

        //原理是Iterator迭代器
        for(String s:list)
        {
            if(s.equals("Today"))
                list.add("boo");
            //
            //  Exception in thread "main" java.util.ConcurrentModificationException
            //   at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1042)
            //   at java.base/java.util.ArrayList$Itr.next(ArrayList.java:996)
            //   at com.StrengthenFor.StrenFor.main(StrenFor.java:35)

            //    Process finished with exit code 1
            //证明是Iterator迭代器

        }
    }
}
