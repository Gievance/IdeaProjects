package com.FileDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
//需求:实现4个对象按年龄排列
public class File24 {
    public static void main(String[] args) throws IOException {
//        从Student.txt读取数据
        ArrayList<Student> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
        String string;
        int num=0;
        while((string=br.readLine())!=null)
        {
            Student s = new Student();
            String[] temp=string.split(",");
            s.setClasss(temp[0]);
            s.setName(temp[1]);
            s.setAge(Integer.parseInt(temp[2]));
            s.setArea(temp[3]);
            arrayList.add(s);
        }
        br.close();
//        已经按照Student.txt创建好了4个对象
//        现需求:实现4个对象按年龄排列
        TreeSet<Student> tree = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                o2-o1，若o2小，则从大到小
//                o1-o2,若o1小，则从小到大
                int num1=o2.getAge()-o1.getAge();
                int num2=num1==0?o2.getName().compareTo(o1.getName()):num1;
                return num2;
            }
        });
        for(Student s:arrayList)
        {
            tree.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("Student2.txt"));

        for (Student s:tree)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(s.getClasss()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getArea());
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();

    }
}
