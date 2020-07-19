package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectdemo {
    public static void main(String[] args) {
        // write your code here
        Collection<String> i=new ArrayList<String>();
        i.add("Hello");
        i.add("World");
        i.add("yesami");
        //Iterator<E> iterator()    返回迭代接口对象
        Iterator<String> it = i.iterator();

        //boolean hasNext()         是否有下一个对象
      /*  for (int is=0;is<3;is++)
        if(it.hasNext()){
            System.out.println(it.next());
      */
        //改进
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

    }
}
