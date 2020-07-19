package com.函数式接口;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("1234", s -> Integer.parseInt(s));
//        ==convert("1234", s -> Integer::parseInt);
        convert2(100, in->String.valueOf(++in));
        convert3("105",Integer::parseInt,String::valueOf);
    }
//    定义一个方法，将String 转换成int
    private static void convert(String n, Function<String,Integer> fun)
    {
        Integer a = fun.apply(n);
        System.out.println(a.intValue());
    }
//    定义一个方法，int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert2(int x,Function<Integer,String> fun)
    {
        String apply = fun.apply(x);
        System.out.println(apply);
    }
//    定义一个方法,字符串转int，int转String
    private static void convert3(String n,Function<String,Integer> fun,Function<Integer,String> fun1)
    {
//        Integer i = fun.apply(n);
//        String s = fun1.apply(i);
//        System.out.println(s);
        System.out.println(fun.andThen(fun1).apply(n));
    }
}
