package com.FileDemo;

import java.io.File;

// 了解File 类，以及构造方法
public class File01 {
    public static void main(String[] args) {
//        构造方法
//        File (String pathname)
//        通过给定的路径名字字符串转换成抽象路径名来创建File实例
//        File (String parent,String child)
//        从父路径名字符串和子路径名字符串创建的FIle实例
//        File (File parent,String child)
//        从父抽象路径名和子路径名字符串创建新的File实例

        File f1=new File("s:\\FileDemo\\java.txt");
        System.out.println(f1);

        File f2=new File("s:\\FileDemo","java.txt");
        System.out.println(f2);

        File f3=new File("s:\\FileDemo");
        File f4 =new File(f3,"java.txt");
        System.out.println(f4);
    }
}
