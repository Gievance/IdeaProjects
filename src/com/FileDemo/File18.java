package com.FileDemo;

import java.io.*;
//了解字符输入流
//        public class InputStreamReader extends Reader
//        public InputStreamReader(InputStream in)
//        public InputStreamReader(InputStream in, String charsetName)
public class File18 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("File3.txt"), "UTF-8");
     /*  方式一
            int len;
        while((len=isr.read())!=-1)
        {
            System.out.print((char)len);
        }
      */
        /*
        方式二
         */
        char[] bytes=new char[1024];//此处是字符数组，因为是使用了字符流
        int len;
        while((len=isr.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        isr.close();
    }
}
