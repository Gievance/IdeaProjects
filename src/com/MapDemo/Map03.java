package com.MapDemo;
//测试Map的获取功能

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map03 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();
        m.put("第1个测试","1");
        m.put("第2个测试","2");
        m.put("第3个测试","3");
        m.put("第4个测试","4");
//        V get(object key)
//        根据键值获取值
        System.out.println(m.get("第1个测试"));
//        Set <K> keySet()
//        获取所有的键
        Set<String> set=m.keySet();
        for(String i:set)
            System.out.println(i);
//        Collection <V> values()
//        获取所有的值
        System.out.println("-----------------------------------");
        Collection<String> c=m.values();
        for(String i:c)
            System.out.println(i);
    }
}
