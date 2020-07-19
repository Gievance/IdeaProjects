package com.FileDemo;

import java.io.*;

//需求：复制单级文件夹
public class File25 {
    public static void main(String[] args) throws IOException {
//       源文件夹S:\FileDemo\java
        File f1 = new File("S:\\FileDemo\\java");
//        获取文件夹名
        String fname=f1.getName();
//        创建目的FIle对象,新路径，由模块名+文件名,这不用加  IdeaProjects
        File f2 = new File("fname");

//      判断目的文件File是否存在
        if(!f2.exists()){
            f2.mkdir();
        }
//        获取所有文件
        File[] listFilesFile=f1.listFiles();
        for (File srcFile:listFilesFile)
        {//获取数据名+后缀
            String srcFileName=srcFile.getName();
//          创建目的地文件File对象，并在新创建的路径下
            File destFile=new File(f2,srcFileName);
//            复制文件
            copyFile(srcFile,destFile);

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
