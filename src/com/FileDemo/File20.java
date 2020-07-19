package com.FileDemo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//需求: 文本文件中的数据读取到集合，并遍历集合，要求：文件中每一行数据是一个集合元素
public class File20 {
    public static void main(String[] args) throws IOException {
// 创建个字符输入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("File4.txt"));
//        创建个集合
        ArrayList<String> array = new ArrayList<>();
//        遍历文件
        String len;
        while((len=br.readLine())!=null)
        {
            array.add(len);
        }
        br.close();
        for (String s:array)
            System.out.println(s);
    }
}
