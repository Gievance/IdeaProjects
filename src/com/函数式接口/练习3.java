package com.函数式接口;

import java.util.function.Function;

//String s="林青霞，30“
//1.将字符串截取到数字年龄部分、
//2，将上一步的年龄字符串转换成int类型的数据
//3、将上一步的int数据加70，得到一个int结果，在控制台输出
//通过Function接口来实现函数拼接
public class 练习3 {
    public static void main(String[] args) {
        String s="林青霞，30";
        sub(s.split("，")[1],s1 -> Integer.parseInt(s1));
    }
    private static void sub(String age, Function<String,Integer> fun)
    {
        Integer i = fun.apply(age);
        System.out.println(i.intValue()+70);
    }
}
