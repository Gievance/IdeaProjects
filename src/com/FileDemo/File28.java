package com.FileDemo;

import java.io.*;
//需求：复制多级文件夹第2次练习

public class File28 {
    public static void main(String[] args)throws IOException {
        File src = new File("s:\\FileDemo");
        File des = new File("e:\\");
        copyFolder(src,des);
    }

    private static void copyFolder(File src, File des) throws IOException{
        if(src.isDirectory()){
            File newFile = new File(des, src.getName());
            if(!newFile.exists())
                newFile.mkdir();
            File[] files = src.listFiles();
            for(File f:files)
            {
                copyFolder(f, newFile);
            }
        }else
        {
            File newFile = new File(des, src.getName());
            copyFile(src,newFile);
        }
    }

    private static void copyFile(File src, File des) throws IOException{
        BufferedInputStream bio = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bso = new BufferedOutputStream(new FileOutputStream(des));
        byte[] bytes=new byte[1024];
        int len;
        while((len=bio.read(bytes))!=-1)
        {
            bso.write(bytes,0,len);
        }
        bio.close();
        bso.close();
    }
}
