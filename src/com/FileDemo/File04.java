package com.FileDemo;

import java.io.File;
import java.io.IOException;

//测试File的删除功能
public class File04 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("s:\\FileDemo\\javase.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.delete());
        File f2 = new File("src\\javase.txt");
        f2.createNewFile();
        f2.delete();
        //删除目录前，其目录中的文件必须先删除

    }
}
