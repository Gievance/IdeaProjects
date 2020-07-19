package com.方法引用;
//引用构造器  类名：：new
public class Method04 {
    public static void main(String[] args) {
//        等同useStudent((age,name)->new Student(age,name));
        useStudent(Student::new);
    }
    public static void useStudent(StudentImp stu){
        Student s=stu.showS(12,"小贝");
        System.out.println(s.getName()+s.getAge());
    }
}
