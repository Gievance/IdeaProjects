package com.方法引用;
//·引用类的实例方法     类名：：成员方法
public class Method03 {
    public static void main(String[] args) {
        useString((s,x,y)->{return s.substring(x, y);});
        useString(String::substring);
    }
    public static void useString(MyString s){
        String string = s.mySubString("abcdefghijk",2,5);
        System.out.println(string);
    }
}
