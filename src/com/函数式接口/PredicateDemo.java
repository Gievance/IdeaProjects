package com.函数式接口;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        System.out.println(  usePredicate("hello", s -> s.length()>8));

    }
    private static boolean usePredicate(String s,Predicate<String> pre)
    {
//        return pre.test(s);
        return pre.negate().test(s);//对test的结果取反

    }
}
