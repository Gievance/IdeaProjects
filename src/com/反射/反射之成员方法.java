package com.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//  方法 	getMethod​(String name, 类<?>... parameterTypes)
//返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。
//方法[] 	getMethods()
//返回一个包含 方法对象的数组， 方法对象反映此 类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些。
//方法 	getDeclaredMethod​(String name, 类<?>... parameterTypes)
//        返回 方法对象，该对象反映此 类对象表示的类或接口的指定声明方法。
//        方法[] 	getDeclaredMethods()
//        返回一个包含 方法对象的数组， 方法对象反映此 类对象表示的类或接口的所有已声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承的方法。
public class 反射之成员方法 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.forClass.Student");
        Method showName = c.getMethod("showName", String.class);

        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

//        Object 	invoke​(Object obj, Object... args)
//在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        showName.invoke(o);
    }
}
