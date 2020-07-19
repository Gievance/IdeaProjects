package com.IO;

import java.io.*;
import java.nio.file.Path;

public class ByteOutputDemo {
    public static void main(String[] args) throws IOException {
//        字节数组输出流
        ByteArrayOutputStream ba = new ByteArrayOutputStream();

        String src="this is a test";
//        写到缓冲器
        ba.write(src.getBytes());
//        输出缓冲器内容
        System.out.println("-"+ba.toString());
//        文件路径
        FileOutputStream fos = new FileOutputStream("ByteArray1.txt");
//        将缓冲器内容写到文件
        ba.writeTo(fos);
        show();
        System.out.println("-Doing a reset");
//        保存之前缓冲器内容
        byte[] cache = ba.toByteArray();
//        文件指针重新指到文件首
        ba.reset();
//        向文件输入三个重置
        ba.write("Doing a reset".getBytes());
        for (int i=0;i<3;i++)
        {
            ba.writeTo(fos);

        }
        show();
        ba.close();
        fos.close();
    }
    private static void show() throws IOException {
        File file = new File("ByteArray1.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));
        }

    }
}
