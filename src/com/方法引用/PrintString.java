package com.方法引用;

public class PrintString implements Printer{
    @Override
    public void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}
