package com.FileDemo;

import java.io.*;

//需求：复制多级文件夹
public class File26 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("S:\\FileDemo");
        String fName=srcFile.getName();
        File desFile = new File(fName);
        if (!desFile.exists()){
            desFile.mkdir();
        }

//        写一个实现文件夹复制的方法
        copyFolder(srcFile,desFile);

    }

    private static void copyFolder(File srcFile, File desFile) throws IOException{
//        判断是否是目录
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(desFile, srcFileName);
            if (!newFolder.exists())
                newFolder.mkdir();
            File[] files = srcFile.listFiles();
            for (File file : files) {
                copyFolder(file,newFolder);
            }
        }else {
            File temp=new File(desFile,srcFile.getName());
            copyFile(srcFile, temp);
        }
    }
    public static void copyFile(File sf,File df) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sf));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(df));

        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1)
        {
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}