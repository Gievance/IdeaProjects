package com.反射;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//练习，通过反射给Student赋值内容并输出
public class 练习2之成员变量 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> ac = Class.forName("com.forClass.Student");
//            无参构造创建对象
        Constructor<?> con = ac.getConstructor();
        Object o = con.newInstance();

        Field name = ac.getField("name");
        name.setAccessible(true);
        name.set(o,"百度");
        System.out.println(o);
    }
}
