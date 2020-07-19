package com.SetJihe;

public class Student implements Comparable<Student>{
    private int age;
    private String name;
    private int math;
    private int chinese;

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public Student(String name, int math, int chinese) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
    }

    public Student(int math, int chinese) {
        this.math = math;
        this.chinese = chinese;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return o.age-this.age;
        //return 整数
    }
}
