package com.MapDemo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//需求：统计字符串中每个字符出现的次数
public class Map08 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i=0;i<s.length();i++)
        {
            char key =s.charAt(i);
            Integer value=hm.get(key);
            if (value==null)
                hm.put(key,1);
            else {
                value++;
                hm.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keyset = hm.keySet();
        for (Character c:keyset)
        {
            Integer nu=hm.get(c);
           sb.append(c).append("(").append(nu).append(")");
        }
        String s1 = sb.toString();
        System.out.print(s1);
        //ILoveyou
        //e(1)u(1)v(1)I(1)y(1)L(1)o(2)
        //如何使其有序---用TreeMap

    }
}
