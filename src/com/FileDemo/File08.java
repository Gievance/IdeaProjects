package com.FileDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//        FileOutputStream( String name)
//	创建文件输出流，以指定的名称写入文件创建文件输出流，以指定的名称写入文件
public class File08 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fls = new FileOutputStream("s:\\FileDemo\\file.txt");

        /*
        FileOutputStream
       做了三件事
       创建文件
       创建了字节输出流对象
       让字节输出流指向对象
         */
        fls.write(97);
        fls.close();
    }
}
