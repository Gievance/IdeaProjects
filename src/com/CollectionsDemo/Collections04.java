package com.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

//        升级：对牌进行排序
public class Collections04 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

//        创建一组牌索引
        ArrayList<Integer> array = new ArrayList<Integer>();
        String[] col = {"♥", "♠", "♦", "♣"};
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String n : num)
            for (String c : col) {
                hm.put(index, c + n);
                array.add(index);
                index++;
            }

        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);

//        洗牌
        Collections.shuffle(array);
        TreeSet<Integer> t1 = new TreeSet<>();
        TreeSet<Integer> t2 = new TreeSet<>();
        TreeSet<Integer> t3 = new TreeSet<>();
        TreeSet<Integer> di = new TreeSet<>();
//       发牌
//        注，顺序是随array，而不是随i，犯了个错误
        for (int i = 0; i < array.size(); i++) {
            int x=array.get(i);
            if(i>=array.size()-3)
                di.add(x);
            else if (i % 3 == 0)
                t1.add(x);
            else if (i % 3 == 1)
                t2.add(x);
            else t3.add(x);
        }
//        遍历
        looker("曹操的牌",t1,hm);
        looker("诸葛亮的牌",t2,hm);
        looker("关羽的牌",t3,hm);
        looker("司马懿的底牌",di,hm);
    }

    public static void looker(String name, TreeSet<Integer> t, HashMap<Integer, String> hm)
    {

        System.out.println(name+":");
        for( Integer key:t)
        {
            String s=hm.get(key);
            System.out.print("\t" + s);
        }
        System.out.println();
    }
}
