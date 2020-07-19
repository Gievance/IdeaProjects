package com.方法引用;
//引用类方法：类名：：静态方法
public class Method01 {
    public static void main(String[] args) {
        useMethod(Integer::parseInt);
    }
    public static void useMethod(method m){
        int convert = m.convert("1000");
        System.out.println(convert);
    }
}
