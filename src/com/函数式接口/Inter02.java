package com.函数式接口;

import java.net.InetAddress;
import java.util.function.Supplier;

//常用的函数式接口
//·Supplier
public class Inter02 {
    public static void main(String[] args) {
        String s = useSupplier(() -> {
            return "林青霞";
        });
        System.out.println(s);



        int[] ints = {19,2,3,10,1,0};
        Integer max1 = getMax(() -> {
            int max = ints[0];
            for (int i : ints) {
                if (i >= max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(max1.intValue());

    }
//    练习：
    private static Integer getMax(Supplier<Integer> sup)
    {
        return sup.get();
    }
//    返回字符串
    public static String useSupplier(Supplier<String> s)
    {
        return s.get();
    }
}
