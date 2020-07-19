package com.SetJihe;

import java.util.Comparator;
import java.util.TreeSet;

public class StuCompa {
    public static void main(String[] args) {
        //本例使用了匿名内部类实现类Comparator这个接口
//        然后，重载了compare方法
        TreeSet<Student> tr=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
                int num2=num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
//        CompareTo 是String里的方法
        Student s1 = new Student(19, "小白");
        Student s2 = new Student(20, "小白2");
        Student s3 = new Student(1, "小白3");
        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        //return 正数，s2>s1 都存
//                  0  ,s2=s1  只存s1
//                负数   s2<s1  倒着存
        for(Student s: tr){
            System.out.println(s.getName()+"  "+s.getAge());
        }

    }
}
