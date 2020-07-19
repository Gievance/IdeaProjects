package com.Fanxing;

public class ChangeVariable {
    public static void main(String[] args) {

        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int...a) {
        //为什么在有main方法的类下写方法要加Static？？
//      没有Static 要进行实例化，显然有main的类是无法实例化的，故加Static就可以直接访问
//        删除Static==Error:(6, 28) java: 无法从静态上下文中引用非静态 方法 sum(int...)
//        静态只能访问静态
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
