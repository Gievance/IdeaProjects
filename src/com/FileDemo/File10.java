package com.FileDemo;

import java.io.FileOutputStream;
import java.io.IOException;

//如何换行？
//如何追加
//字节输出流写数据加异常处理
public class File10 {
    public static void main(String[] args)  {
//        Window下的换行符：\r\n
//        Linux:\n
//        mac:\r
//        实现追加，则更改构造器
        FileOutputStream fls=null;
try {
    fls = new FileOutputStream("File.txt",true);
    for(int i=0;i<5;i++)
    {
        fls.write("Hello World".getBytes());
        fls.write("\r\n".getBytes());//getBytes(此处可以规定编码)
    }

}catch (IOException i){
    i.printStackTrace();
}finally {
//    finally实现fls清除
    try {
        fls.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    }
}
