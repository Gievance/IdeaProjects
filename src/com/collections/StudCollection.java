package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudCollection {
    public static void main(String[] args) {
        //需求：创建一个存储学生对象的集合，存储3个学生对象，使程序在控制台遍历该集合
        Collection<Student> stu=new ArrayList<Student>();
        //创建学生对象
        Student stu1=new Student("光头强",12);
        Student stu2 = new Student("林青霞", 23);
        Student stu3 = new Student("刹那", 21);
        //添加到集合
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);

        //使用迭代器来实现遍历
        Iterator<Student> it = stu.iterator();
        while(it.hasNext())
        {
            Student s=it.next();
            System.out.println("姓名："+s.getName()+"年龄"+s.getAge());
        }
        System.out.println("迭代结束");
    }
}
