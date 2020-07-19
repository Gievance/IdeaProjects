package com.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//方式一遍历Map
public class Map04 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();
        m.put("第1个测试","1");
        m.put("第2个测试","2");
        m.put("第3个测试","3");
        m.put("第4个测试","4");
        Set<String> ke = m.keySet();
        for(String i:ke)
        {
            System.out.println(i+","+m.get(i));
        }
    }
}
