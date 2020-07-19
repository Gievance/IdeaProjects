package com.MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
//HashMap 嵌套  ArrayList
public class Map07 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("诸葛亮");
        ar1.add("刘备");
        ar1.add("曹操");
        ar1.add("赵云");
        hm.put("三国演义",ar1);

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("唐僧");
        ar2.add("孙悟空");
        hm.put("西游记",ar2);

        ArrayList<String> ar3 = new ArrayList<>();
        ar3.add("武松");
        ar3.add("鲁智深");
        hm.put("水浒传",ar3);

        Set<String> set = hm.keySet();
        for(String k:set)
        {
            ArrayList<String> value=hm.get(k);
            System.out.println(k+":");
            for(String val:value)
            {
                System.out.println("\t"+val);
            }
        }

    }
}
