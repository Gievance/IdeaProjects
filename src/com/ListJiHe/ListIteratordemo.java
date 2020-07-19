package com.ListJiHe;

import java.util.*;

public class ListIteratordemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("这");
        list.add("在");
        list.add("测");
        list.add("试");
        list.add("ListIterator");

        ListIterator<String> it = list.listIterator();
        System.out.println("正向遍历————————————————");
        while(it.hasNext()){
            String s=it.next();
            if(s.equals("测"))
                it.add("插入");
            System.out.println(s);
        }
        System.out.println("逆向遍历----------------");
        while(it.hasPrevious())
        {
            String s=it.previous();
            System.out.println(s);
            //你可能会好奇previous
          /*  public E previous() {
            checkForComodification();
            int i = cursor - 1;
            if (i < 0)
                throw new NoSuchElementException();
            Object[] elementData = ArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i;
            return (E) elementData[lastRet = i];
        }
            */
        }

        }
}
