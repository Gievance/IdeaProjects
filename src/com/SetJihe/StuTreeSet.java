package com.SetJihe;

import java.util.TreeSet;

public class StuTreeSet {
    public static void main(String[] args) {

        /*  利用comparable对学生进行自然排序
            public interface Comparable<T> {
            该接口对实现它的每一个类强加一个整体排序，这个排序被称为类的自然排序

         */
        TreeSet<Student> tr=new TreeSet<Student>();
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
