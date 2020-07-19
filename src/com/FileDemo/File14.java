package com.FileDemo;

import java.io.*;

//利用字节缓冲流，实现读写数据
public class File14 {
    public static void main(String[] args) throws IOException {

//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("File2.txt"));
//        byte[] bytes=new byte[1024];
//        int len;
//        while((len=bytes.))
//        bos.write("Hello\r\n".getBytes());
//        bos.write("World\r\n".getBytes());
//        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File2.txt"));
        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));//此处注意和File13的区别

        }
    }
}
