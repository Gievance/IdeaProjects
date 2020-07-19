package com.PropertiesDemo;

import java.util.Properties;
import java.util.Set;

//Properties 作为Map使用
//        public class Properties extends Hashtable<Object,Object>，无泛型
public class Properties01 {
    public static void main(String[] args) {
//        Properties<String, String> pro = new Properties<String, String>;
        Properties properties = new Properties();
//       存储元素
        properties.put("S1", "12");
        properties.put("S2", "13");
        properties.put("S3", "14");
        properties.put("S4", "15");
//        借助Map的方式遍历
        Set<Object> keySet = properties.keySet();
        for(Object key:keySet){
            Object o = properties.get(key);
            System.out.println(key+","+o);
        }

    }
}
