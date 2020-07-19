package com.MapDemo;

import java.util.*;

public class Map之遍历 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
        hs.put(1,"一一");
        hs.put(2,"二二");
        hs.put(3,"三三");
        hs.put(4,"四四");
        hs.put(5,"五五");
        hs.put(6,"六六");
        bianByEntry(hs);
        System.out.println("---------");
        bianByKeySet(hs);
        System.out.println("---------");
        bianByEnumeration(hs);
    }

    private static void bianByEnumeration(Hashtable<Integer, String> hs) {
        Enumeration<Integer> keys = hs.keys();
        while(keys.hasMoreElements())
        {
            Integer integer = keys.nextElement();
            String s = hs.get(integer);
            System.out.println(integer+s);
        }
    }

    private static void bianByKeySet(Hashtable<Integer, String> hs) {
        Iterator<Integer> it = hs.keySet().iterator();
        while(it.hasNext())
        {
            Integer key = it.next();
            String s = hs.get(key);
            System.out.println(key+s);
        }
    }

    private static void bianByEntry(Hashtable<Integer,String> hs) {
        Iterator<Map.Entry<Integer, String>> it = hs.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer, String> next = it.next();
            System.out.println(next.getKey()+next.getValue());
        }
    }
}
