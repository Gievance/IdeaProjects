package com.Lambda表达式;
//使用Lambda---不带形参
public class Lambda02 {
    public static void main(String[] args) {
        useEatable(()->{
            System.out.println("苹果");
        });
    }
    public static void useEatable(Eatable e)
    {
        e.eat();
    }
}
