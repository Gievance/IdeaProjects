package com.FileDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class File09 {
    public static void main(String[] args) throws IOException {
//        void write (int b)
//        将指定的字节写入此文件输出流
//        void close()
//        关闭占用资源
//        void write ( byte[] b)
//        指定的字节数组写入此文件输出流，一次写一个字节数组数据
//        void write(byte[] b,int off,int len)
//        从off偏移量开始，读len长度字节，写入输出流
//        byte[] getBytes();返回字符串对应的字节数组

        FileOutputStream fls = new FileOutputStream("s:\\FileDemo\\file.txt");
        byte[] bytes="This is the Fileout".getBytes();
        fls.write(bytes);
        fls.write(bytes,0,10);

    fls.close();

    }
}
