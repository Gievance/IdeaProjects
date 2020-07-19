package com.SetJihe;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Supply1 {
    public static void main(String[] args) {
        //创建Set对象
        Set<Integer> it=new TreeSet<Integer>();
        //创建随机数
        Random i=new Random();

        while(it.size()<10)
        {
            int num=i.nextInt(20)+1;
            it.add(num);
        }
        for(Integer ii:it)
        {
            System.out.println(ii);
        }
    }
}
