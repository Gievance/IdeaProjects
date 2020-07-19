package com.ListJiHe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLink {
    public static void main(String[] args) {
        String[] str={"Hello","World","My","Lovely","Kid","Boy"} ;
        List<String> list=new ArrayList<String>();
        for(int i=0;i<str.length;i++)
        {
            list.add(str[i]);
        }
        System.out.println("ArrayList遍历开始---------");
        for(String i:list)
        {
            System.out.println(i);
        }
        System.out.println("Array遍历结束");
        List<String> link=new LinkedList<String>();
        for(int i=0;i<str.length;i++)
        {
            link.add(str[i]);
        }
        System.out.println("LinkedList遍历开始---------");
        for(String s:link)
        {
            System.out.println(s);
        }
    }
}
