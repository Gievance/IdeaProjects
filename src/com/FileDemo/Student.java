package com.FileDemo;

import java.io.Serializable;

public class Student implements Serializable {
    private  static final long serialVersionUID=42l;//反序列化，类的ID，不变
    private String classs;
    private String name;
private transient int age;
private String area;

    public Student(String name, int age) {
        this.classs="Class";
        this.name = name;
        this.age = age;
        this.area="area";
    }

    public Student() {
    }

    public Student(String classs, String name, int age, String area) {
        this.classs = classs;
        this.name = name;
        this.age = age;
        this.area = area;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classs='" + classs + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", area='" + area + '\'' +
                '}';
    }
}
