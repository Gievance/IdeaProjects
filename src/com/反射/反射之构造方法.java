package com.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 反射之构造方法 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        static 类<?> 	forName​(String className)
//返回与具有给定字符串名称的类或接口关联的 类对象。
        Class<?> c = Class.forName("com.forClass.Student");




//        构造器<?>[] 	getConstructors()
//返回一个包含 构造器对象的数组， 构造器对象反映了此 类对象所表示的类的所有公共构造函数。
        System.out.println("----公共的构造函数");
        Constructor<?>[] c1 = c.getConstructors();
        for(Constructor ss:c1)
        {
            System.out.println(ss);
        }
        System.out.println("--------所有构造包括私有和默认----");





//  构造器<?>[] 	getDeclaredConstructors()
//返回 构造器对象的数组， 构造器对象反映由此 类对象表示的类声明的所有构造函数。
//  构造器<T> 	getDeclaredConstructor​(类<?>... parameterTypes)
//返回一个 构造器对象，该对象反映此 类对象所表示的类或接口的指定构造函数。
        Constructor<?>[] c2 = c.getDeclaredConstructors();
        for(Constructor ss:c2)
            System.out.println(ss);
        System.out.println("-------某一特定的公共构造函数");
        Constructor<?> c3 = c.getConstructor(String.class, int.class, int.class);
        System.out.println(c3);

        System.out.println("------借助Constructor 创建对象-----");





//        T 	newInstance​(Object... initargs)
//使用此 构造器对象表示的构造方法，使用指定的初始化参数创建和初始化构造函数声明类的新实例。
        Constructor<?> c4 = c.getConstructor();//获取无参构造的字节码
        Object o = c4.newInstance();
        System.out.println(o);
    }
}
