package com.FileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
//需求：点名器
//	一个Students.txt文件存储了学生姓名，每一个姓名占一行，要求：通过程序随机点名
public class File21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Students.txt"));

        ArrayList<String> arr = new ArrayList<>();

        String stu;
        while((stu=br.readLine())!=null)
        {
            arr.add(stu);
        }
//        此步需得到优化，随机数上限是集合的上限
//        int ran=(int)(Math.random()*10);
        Random random = new Random();
        int ran=random.nextInt(arr.size());

        System.out.println("点到：");
        System.out.println(arr.get(ran));





        br.close();
    }
}
