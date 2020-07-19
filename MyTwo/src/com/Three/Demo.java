package com.Three;

import com.One.Student;
import com.Two.Teacher;
//访问MyOne模块下的两个类
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        Teacher t = new Teacher();
        t.teach();
    }
}
