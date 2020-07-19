package com.FileDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File13 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("S:\\FileDemo\\Space1.jpg");
        FileOutputStream fls = new FileOutputStream("Space1.jpg");

        byte[]  bytes=new byte[1024];//创建个 字节数组
        int len;//用来接收，读取的字节长度
        while((len=fis.read(bytes))!=-1)//如果字节长度无，则返回-1
        {
            fls.write(bytes,0,len);//写入字节数组，长度为len
        }

//        释放资源
        fis.close();
        fls.close();

    }
}
