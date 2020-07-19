package com.反射;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class 练习配置 {
    public static void main(String[] args) throws Exception {
//        读取配置文件方式一：Properties
        Properties properties = new Properties();
//        properties.load(new FileInputStream("src\\com\\反射\\class.txt"));

//        读取配置文件二：classLoader
        ClassLoader cl = 练习配置.class.getClassLoader();
        InputStream is = cl.getResourceAsStream("src\\com\\反射\\class.txt");
        properties.load(is);

//    显示
        String user = properties.getProperty("className");
        String password = properties.getProperty("methodName");
        System.out.println(user+password);
    }
}
