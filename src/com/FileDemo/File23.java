package com.FileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//文件到集合的改进
public class File23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
        ArrayList<Student> arr = new ArrayList<>();
        String line;
        while((line=br.readLine())!=null){
            String[] str=line.split(",");
            Student s=new Student();
            s.setClasss(str[0]);
            s.setName(str[1]);
            s.setAge(Integer.parseInt(str[2]));
            s.setArea(str[3]);
            arr.add(s);
        }
        br.close();
        for(Student s:arr)
        {
            System.out.println(s.getClasss()+s.getName()+s.getAge()+s.getArea());
        }
    }
}
