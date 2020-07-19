package com.forClass;

public class Student {
    public String name;
    private int age;
    int id;
    String area;

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    private Student(int age) {
        this.age = age;
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student(String name, int age, int id, String name1) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.name = name1;
    }

    public Student(String name, int age, String area) {
        this.name = name;
        this.age = age;
        this.area = area;
    }

    public void show(String name,int age,String area) {
        System.out.println(name + age + area);
    }

   public void showName(String name)
   {
       System.out.println(name);
   }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", area='" + area + '\'' +
                '}';
    }
}
