package com.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

//反射之越过泛型检查
public class 练习4之越过泛型 {
    //    ArrayList<Integer> 集合，存放字符串数据？？
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//    创建集合
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
//    Class<?> 	getClass()  返回此 Object的运行时类。
        Class<? extends ArrayList> c = arr.getClass();
//       获取add方法
        Method add = c.getMethod("add", Object.class);
        add.invoke(arr,"hello");
        add.invoke(arr,"this");
        System.out.println(arr);
    }

}
