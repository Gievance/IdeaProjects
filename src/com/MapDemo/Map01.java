package com.MapDemo;

import java.util.HashMap;
import java.util.Map;
//了解Map的使用
public class Map01 {
    public static void main(String[] args) {

        //        public interface Map<K, V>
        Map<String,String> m=new HashMap<String,String>();
        //HashMap为Map的实现类

        m.put("第1个数字","1");
        m.put("第2个数字","2");
        m.put("第3个数字","3");
        System.out.println(m);

    }
}
