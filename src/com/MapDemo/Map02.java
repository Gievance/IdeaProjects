package com.MapDemo;

import java.util.HashMap;
import java.util.Map;
//测试Map中含有的方法
public class Map02 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();
//        Map方法
//        V  put(K key,V value)
//        将键与值相关联，添加元素
        m.put("第1个测试","1");
        m.put("第2个测试","2");
        m.put("第3个测试","3");
        m.put("第4个测试","4");
//        V remove (Object  key）
//        根据键值删除键值对元素
        m.remove("第1个测试");
        System.out.println("是否删除第一个元素？"+"\n"+m);
//        void  clear()
//        删除所有键值对元素
        m.clear();
        System.out.println("是否删除全部元素？"+m);
//        boolean  containsKey (Object key)
//        是否包含指定的键
        m.put("1","111111");
        System.out.println(m.containsKey("1"));
//        boolean containsValue(Object value）
//        是否包含指定的值
        System.out.println(m.containsValue("11111"));
//        boolean isEmpty()
//        判断集合是否为空
        System.out.println(m.isEmpty());
//        int size()
//        集合的长度
        System.out.println(m.size());
    }
}
