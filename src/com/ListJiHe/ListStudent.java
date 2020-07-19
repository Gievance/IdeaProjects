package com.ListJiHe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStudent {
    //List 集合存储学生对象并遍历
    public static void main(String[] args) {
        Student stu1 = new Student(16,"刘备");
        Student stu2 = new Student(17,"张飞");
        Student stu3 = new Student(18,"关于");
        List<Student> lis=new ArrayList<Student>();
        lis.add(stu1);
        lis.add(stu2);
        lis.add(stu3);

        Iterator<Student> it=lis.iterator();
        while(true)
        {
            if(it.hasNext())
            {   Student s=it.next();
                System.out.println("年龄："+s.getAge()+"姓名："+s.getName()+"\n");
            }
        }

    }
}
