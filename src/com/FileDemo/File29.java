package com.FileDemo;

import java.io.*;

//需求：复制多级文件夹
//第三次练习
//归纳
/*
创建源文件路径对象
创建目的文件路径
  判断源文件路径是否是目录
    是，则在目的路径创建目录
    列出源文件的子文件路径
    递归调用判断
    不是，则传输文件

 */
public class File29 {
    public static void main(String[] args) throws IOException{
        File src = new File("e:\\FileDemo");
        File des = new File("s:\\");
        copyFolder(src,des);
    }

    private static void copyFolder(File src, File des) throws IOException{
        if(src.isDirectory()){//如果源文件是目录->则在目的路径创建目录
            File newFile = new File(des, src.getName());
            if(!newFile.exists()){
                newFile.mkdir();
            }
//            创建好目录后—>查看源目录下的文件
            File[] files = src.listFiles();
            for(File f:files)
            {
                copyFolder(f,newFile);//递归调用，对子文件也是进行判断
            }

        } else{//如果不是目录，则文件传输
            File newFile = new File(des,src.getName());//此处出现一次错误，没有des
            copyFile(src,newFile);
        }
    }

    private static void copyFile(File src, File des) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1)
        {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }

}
