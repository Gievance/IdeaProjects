package com.ListJiHe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class threewaystru {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        Student s1=new Student(16,"曹操");
        Student s2=new Student(18,"郭嘉");
        Student s3 = new Student(19, "诸葛亮");
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历一：增强For
        for(Student s:list)
        {
            System.out.println(s.getName()+"已经"+s.getAge()+"岁了");
        }
        System.out.println("--------------------------");
        //遍历二:for
        for(int i=0;i<list.size();i++)
        {   Student s=list.get(i);
            System.out.println(s.getName()+"已经"+s.getAge()+"岁了");
        }
        System.out.println("---------------------------");
        //遍历三：Iterator
        Iterator<Student> it=list.iterator();
        while(it.hasNext())
        {
            Student s=it.next();
            System.out.println(s.getName()+"已经"+s.getAge()+"岁了");
        }
        System.out.println("遍历完成");
        //遍历四：listIterator
        ListIterator<Student> lit=list.listIterator();
        while(lit.hasNext())
        {
            Student s=lit.next();
            System.out.println(s.getName()+"已经"+s.getAge()+"岁了");
        }
    }
}
