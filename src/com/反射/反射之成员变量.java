package com.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//      字段 	getField​(String name)
//返回 字段对象，该对象反映此 类对象表示的类或接口的指定公共成员字段。
//      字段[] 	getFields()
//返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段。
//      字段 	getDeclaredField​(String name)
//        返回 字段对象，该对象反映此 类对象表示的类或接口的指定声明字段。
//      字段[] 	getDeclaredFields()
//        返回 字段对象的数组， 字段对象反映由此 类对象表示的类或接口声明的所有字段。
public class 反射之成员变量 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, ClassNotFoundException, NoSuchMethodException {
        Class<?> c = Class.forName("com.forClass.Student");
        Field name = c.getField("name");
        Constructor<?> cs = c.getConstructor();
        Object o = cs.newInstance();
//        void 	set​(Object obj, Object value)
//将指定对象参数上此 字段对象表示的字段设置为指定的新值。
        name.set(o,"百度");
        System.out.println(o.toString());
    }
}
