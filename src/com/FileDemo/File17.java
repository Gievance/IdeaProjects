package com.FileDemo;

import java.io.*;
import java.nio.charset.Charset;

/*符流中的解码编码
        Reader ：字符输入流的抽象类
        InputStreamReader
        读取字节，并解码为字符
        Write：字符输出流的抽象类
        OutputStreamWrite
        按指定字符集，编码为字节，

 */
public class File17 {
    public static void main(String[] args) throws IOException {
//        了解字符输出流
//        public class OutputStreamWriter extends Writer
//        public OutputStreamWriter(OutputStream out)
//        public OutputStreamWriter(OutputStream out, String charsetName)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("File3.txt"),"UTF-8");
        osw.write("中国");
        osw.close();
    }
}
