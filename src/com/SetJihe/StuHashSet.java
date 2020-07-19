package com.SetJihe;

import java.util.HashSet;
import java.util.Iterator;

public class StuHashSet {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<Student>();
        Student s1=new Student(11,"小白");
        Student s2 = new Student(12, "小红");
        Student s3 = new Student(12, "小蓝");
        h.add(s1);
        h.add(s2);
        h.add(s3);

        //遍历一
        for(Student i:h)
        {
            System.out.println(i.getAge()+i.getName());
        }
        //遍历二
        Iterator<Student> it=h.iterator();
        while(it.hasNext())
        {   Student s=it.next();
            System.out.println(s.getAge()+s.getName());
        }
    }
}
