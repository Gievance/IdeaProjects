package com.ListJiHe;

import java.util.LinkedList;

public class LinklistDemo {
    public static void main(String[] args) {
        LinkedList<String> link =new LinkedList<String>();
        /*
        - public void addFirst(E e)	在开头插入指定元素
-         public void addLast(E e)   将指定元素追加到列表末尾
-         public E getFirst()   返回列表中的第一个元素
-         public E getLast()    返回列表中的最后一个元素
-         public E removeFirst()   删除并返回第一个元素
-         public E removeLast()  删除并返回最后一个元素
         */
        link.add("Hello");
        link.add("World");
        link.add("Java") ;


        link.addFirst("First");
        link.addLast("Last");
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        System.out.println("遍历结果----------------");
        for(String i:link){
            System.out.println(i);
        }

    }
}
