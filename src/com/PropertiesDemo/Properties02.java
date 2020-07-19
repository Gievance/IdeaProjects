package com.PropertiesDemo;

import java.util.Properties;
import java.util.Set;

//         String 	getProperty(String key)
//        在此属性列表中搜索具有指定键的属性
//        Object 	setProperty​(String key, String value)
//        底层调用 Hashtable方法 put 。
//        Set<String> 	stringPropertyNames()
//        从此属性列表返回一组不可修改的键，其中键及其对应的值是字符串，如果尚未
//        从主属性列表中找到相同名称的键，则包括默认属性列表中的不同键。
public class Properties02 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("小何1", "大白1");
        properties.setProperty("小何2", "大白2");
        properties.setProperty("小何3", "大白3");
        properties.setProperty("小何4", "大白4");
        System.out.println(properties.getProperty("小何"));
        Set<String> strings = properties.stringPropertyNames();
        for (String key:strings)
        {
            System.out.println(key+properties.getProperty(key));
        }
    }
}
