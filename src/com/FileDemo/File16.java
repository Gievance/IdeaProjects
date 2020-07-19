package com.FileDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*byte[] getBytes()
        使用默认的字符集，存储到字节数组中
        byte[] getBytes(String charsetName)
        使用指定的字符集
        构造器
        String (byte[] bytes)
        通过默认字符集，指定的字节数组来构造字符串
        String (byte[] bytes,String charsetName)
        指定字符集

 */
public class File16 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
        byte[] bytes=s.getBytes();
        byte[] bytes1=s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));//UTF-8是三字节
        System.out.println(Arrays.toString(bytes1));//GBK是双字节
        String s1=new String(bytes);
        String s2=new String(bytes1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
