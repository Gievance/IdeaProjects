package com.CollectionsDemo;
//了解Collections工具类

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections01 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(30);
       list.add(20);
       list.add(1);

       list.add(40);
//        public static void reverse( List <? > list)
//        反转指定列表中元素的顺序
        Collections.reverse(list);
        System.out.println(list);
//        public static <T  extends Comparable <? super T>> void sort (List<T> list)
//        将指定列表升序排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("----带有Comparator的sort-----");
        //实现从大到小
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num=o2-o1;
                int num2=num==0?0:num;
                return num2;
            }
        });
        System.out.println(list);
        System.out.println("------------");


        System.out.println("-----swap交换最大和最小的位置----");
        Collections.swap(list,0,list.size()-1);//底层是数组，故-1
        System.out.println(list);
        System.out.println("-------------");


        System.out.println("-----rotate旋转----");
     Collections.rotate(list,1 );
        System.out.println(list);
        System.out.println("-------------");
//        public static void shuffle( List <? > list
//        使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);
        System.out.println(list);
    }
}
