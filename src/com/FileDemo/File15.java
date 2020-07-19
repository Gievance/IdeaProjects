package com.FileDemo;

import java.io.*;
//  复制音乐

public class File15 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("s:\\FileDemo\\video.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("video.mp3"));
        long start=System.currentTimeMillis();
        //方式一  20ms
//        byte[] bytes=new byte[1024];
//        int len;
//        while((len=bis.read(bytes))!=-1)
//        {
//            bos.write(bytes,0,len);
//        }
        //方式二  104ms
//        int b;
//        while((b=bis.read())!=-1)
//        {
//            bos.write(b);
//        }
        //
        long end=System.currentTimeMillis();
        bis.close();
        bos.close();
        System.out.println("共耗时："+(end-start)+"ms");
    }
}
