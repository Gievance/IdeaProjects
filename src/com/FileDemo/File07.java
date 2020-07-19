package com.FileDemo;
//递归遍历文件

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File07 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入路径：");
        String g=sc.nextLine();
        File f1 = new File(g);
        getAllFilePath(f1);
    }
    public static void getAllFilePath(File f)
    {       File[] filearr=f.listFiles();
        if(filearr!=null)
        {
            for( File file:filearr)
            {
                if (file.isDirectory())
                    getAllFilePath(file);
                else System.out.println(file.getAbsolutePath());

            }
        }
    }
//    如何获取所有文件？listFiles()
}
