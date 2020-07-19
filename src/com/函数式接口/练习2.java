package com.函数式接口;

import java.util.ArrayList;
import java.util.function.Predicate;
//信息筛选

public class 练习2 {
    public static void main(String[] args) {
        String[] array={"林青霞，30","白龙马，13","小黑，33","小白，22"};
        ArrayList<String> arr = new ArrayList<>();
        for (String s:array)
        {
            if(usePre(s,s1 -> s1.split("，")[0].length()>2,s1 ->Integer.parseInt(s1.split("，")[1])>20))
            arr.add(s);
        }
        System.out.println(arr);
    }
    private static boolean usePre(String s, Predicate<String> p1,Predicate<String> p2)
    {
        return p1.and(p2).test(s);
    }
}
