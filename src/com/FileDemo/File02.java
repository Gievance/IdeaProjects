package com.FileDemo;

import java.io.File;
import java.io.IOException;

//了解File类的创建功能
public class File02 {
    public static void main(String[] args) throws IOException{
//        需求1：在s:\\FileDemo 目录下创建一个文件java.txt
        //public boolean createNewFile()
        File f1=new File("s:\\FileDemo\\java.txt");
        System.out.println(f1.createNewFile());
//        需求2：在s:\\FileDemo 目录下创建一个目录javaSE
        File f2=new File("s:\\FileDemo\\javaSE");
        System.out.println(f2.mkdir());
//        需求3：在s:\\FileDemo 目录下创建一个多级目录javaWeb\\Html
        File f3=new File("s:\\FileDemo\\javaWeb\\Html");
        System.out.println(f3.mkdirs());
//        需求4：在s:\\FileDemo 目录下创建一个文件javase.txt
        File f4=new File("s:\\FileDemo\\javase.txt");
        System.out.println(f4.createNewFile());
    }
}
