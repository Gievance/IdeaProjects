package com.FileDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//需求: 把ArrayList集合中的字符串数据写到文本文件，要求：每一个字符串元素作为文件中的一行数据
public class File19 {


    public static void main(String[] args) throws IOException {
//        创建ArrayList对象
        ArrayList<String> al = new ArrayList<>();
        al.add("张飞");
        al.add("诸葛亮");
        al.add("曹操");
        al.add("马可波罗");
        al.add("枸杞");
        al.add("爱因斯坦");
        al.add("小白龙");
        al.add("迪迦");
        al.add("折木奉太郎");
//        创建字符缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("Students.txt"));
//
//        String[] str=new String[1024];
//        for(int i=0;i<al.size();i++)
//        {   String temp=al.get(i);
//            String[i]=temp;
//        }
        for (String s:al)
        {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
