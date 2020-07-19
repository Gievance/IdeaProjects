package com.ListJiHe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListException {
    public static void main(String[] args) {
        //并发修改异常
        List<String> list=new ArrayList<String>();
        list.add("String");
        list.add("Hellow");
        list.add("world");
       /* Iterator<String> it=list.iterator();
          while(it.hasNext()){
            String s=it.next();
            if(s.equals("world"))
                list.add("并发异常");//导致modCount++
        }

       */
        //解决：不使用next(),利用for循环和get方法
        for(int x =0 ;x < list.size() ; x ++) {
            String s =list.get(x) ;
            if(s.equals("world")) {
                list.add("javaee") ;
            }
        }
        Iterator<String> it=list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
