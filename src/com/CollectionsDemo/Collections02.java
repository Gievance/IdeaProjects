package com.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 需求：存储学生对象，并按照年龄排序
public class Collections02 {
    public static void main(String[] args) {
        Student s1 = new Student(15, "曹操");
        Student s2 = new Student(12, "诸葛亮");
        Student s3 = new Student(13, "司马懿");
        Student s4 = new Student(13, "司马昭");

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        //Collections 对ArrayList 排序
        //给定比较器
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
//            从小到大
            public int compare(Student o1, Student o2) {
                int re=o1.getAge()-o2.getAge();
                int re2=re==0?o1.getName().compareTo(o2.getName()):re;
                return re2;
            }
        });
        for(Student s:arrayList)
        {
            System.out.println(s.getAge()+" "+s.getName());
        }
    }
}
