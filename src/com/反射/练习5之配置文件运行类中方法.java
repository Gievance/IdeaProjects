package com.反射;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
      提供一个配置文件，class.txt方便Class的读取
      */
public class 练习5之配置文件运行类中方法 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//      利用Properties类
        Properties pro = new Properties();
        FileReader f = new FileReader("src\\com\\反射\\class.txt");
        pro.load(f);
        f.close();
//        从class.txt获取属性
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

        Method method = c.getMethod(methodName);
        Object invoke = method.invoke(o);
//之后可以通过class.txt 确定调用的类和方法

    }
}
