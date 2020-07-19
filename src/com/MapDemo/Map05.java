package com.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//方式二遍历Map；类似结婚证

public class Map05 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>();
        m.put("第1个测试","1");
        m.put("第2个测试","2");
        m.put("第3个测试","3");
        m.put("第4个测试","4");
        Set<Map.Entry<String,String>> mm=m.entrySet();
        for(Map.Entry<String,String> map:mm)
        {
            String key=map.getKey();
            String val=map.getValue();
            System.out.println(key+","+val);
        }
    }
}
