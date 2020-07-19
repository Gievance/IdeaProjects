package com.FileDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//集合到文件的改进
public class File22 {
    public static void main(String[] args)throws IOException {
        Student s1 = new Student("class1", "小龙", 21, "北京");
        Student s2 = new Student("class2", "小白", 22, "西安");
        Student s3 = new Student("class3", "小黑", 23, "陕北");
        Student s4 = new Student("class4", "小黄", 24, "北京");
        ArrayList<Student> arr = new ArrayList<>();
        Student[] ss={s1,s2,s3,s4};

        for(int i=0;i<4;i++){
            arr.add(ss[i]);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));

       for (Student s:arr){
           StringBuilder sb=new StringBuilder();
          sb.append(s.getClasss()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getArea());
           String strings =sb.toString();
           bw.write(strings);
           bw.newLine();
       }
       bw.close();
    }
}
