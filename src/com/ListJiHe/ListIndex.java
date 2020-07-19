package com.ListJiHe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIndex {
    public static void main(String[] args) {
        //List 有序+可重复+索引
        //展示List中的索引
        List<String> list=new ArrayList<String>();
        list.add("String") ;
        list.add("方法");
        list.add("迭代器遍历");
        list.add("String");
        //   - void add(int index,E element)    在此集合中的指定位置插入指定的元素
        //   - E remove (int index)   删除指定索引处的元素，返回被修改的元素
        //   - E set(int index,E element)   修改指定索引处的元素，返回被修改的元素
        //   - E get(int index)    返回指定索引处 的元素
        list.add(0,"插入");//从0开始
        list.remove(4);
        System.out.println("被修改元素："+list.set(1,"String修改")+"------------");
        System.out.println(list.get(3));
        //int indexOf(Object o);  返回对象最后出现的位置
        System.out.println(list.indexOf("方法"));
        System.out.println("------------分割线-------------");
        //遍历
        Iterator<String> it=list.iterator();
        while (it.hasNext())
        {
            String s=it.next();
            System.out.println(s);
        }
    }
}
