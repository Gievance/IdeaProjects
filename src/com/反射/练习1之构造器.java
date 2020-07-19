package com.反射;

import com.forClass.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//通过反射完成下列。
//Student s=new Student("小白龙",22);
//输出，
public class 练习1之构造器 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Class<?> c = Class.forName("com.forClass.Student");
        Constructor<?> cC = c.getConstructor(String.class, int.class, String.class);
        Student o = (Student) cC.newInstance("小白龙", 22,"北京");
//        o.show();

//  private Student(int age) {
//        this.age = age;
//    }
//        暴力反射？指通过类的私有方法，创建对象需用到
//        void 	setAccessible​(boolean flag)
//将此反射对象的accessible标志设置为指示的布尔值。 值true表示反射对象在使用时应禁止检查Java语言访问控制。 值false表示反射对象在使用时应强制检查Java语言访问控制，并在类描述中注明变体。
        Constructor<?> d = c.getDeclaredConstructor(String.class);
        d.setAccessible(true);
        Object o1 = d.newInstance("小黑");
        Student s=(Student)o1;
        System.out.println(s.name);
    }
}
