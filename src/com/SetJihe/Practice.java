package com.SetJihe;

import java.util.Comparator;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {
        TreeSet<Student> it=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int sumo1=o1.getMath()+o1.getChinese();
                int sumo2=o2.getMath()+o2.getChinese();
                int com=sumo1-sumo2;
                int com2=com==0?o1.getName().compareTo(o2.getName()):com;
                return com2;
            }
        });
        Student s1=new Student("曹操",79,90);
        Student s2=new Student("张飞",80,85);
        Student s3=new Student("白嫖",82,77);
        it.add(s1);
        it.add(s2);
        it.add(s3);
        for(Student s:it)
        {
            System.out.println(s.getName()+" "+s.getMath()+"  "+s.getChinese()+"  "+(s.getMath()+s.getChinese()));
        }

    }
}
