package com.方法引用;
//引用对象   对象：：成员方法
public class Method02 {
    public static void main(String[] args) {
        PrintString ps = new PrintString();
        usePrint(ps::printUpperCase);
    }
    public static void usePrint(Printer p)
    {
        p.printUpperCase("this is printer");
    }
}
