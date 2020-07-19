package com.CollectionsDemo;

import com.sun.source.tree.Tree;

import java.util.*;

public class Collections03 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("大王");array.add("小王");
//        这样写很累
//        array.add("红桃A");array.add("黑桃A");array.add("梅花A");array.add("方块A");
//        array.add("红桃2");array.add("黑桃2");array.add("梅花2");array.add("方块2");
//        array.add("红桃3");array.add("黑桃3");array.add("梅花3");array.add("方块3");
//        array.add("红桃4");array.add("黑桃4");array.add("梅花4");array.add("方块4");
//        array.add("红桃5");array.add("黑桃5");array.add("梅花5");array.add("方块5");
//        array.add("红桃6");array.add("黑桃6");array.add("梅花6");array.add("方块6");
//        array.add("红桃7");array.add("黑桃7");array.add("梅花7");array.add("方块7");
//        array.add("红桃8");array.add("黑桃8");array.add("梅花8");array.add("方块8");
//        array.add("红桃9");array.add("黑桃9");array.add("梅花9");array.add("方块9");
//        array.add("红桃10");array.add("黑桃10");array.add("梅花10");array.add("方块10");
//        array.add("红桃J");array.add("黑桃J");array.add("梅花J");array.add("方块J");
//        array.add("红桃Q");array.add("黑桃Q");array.add("梅花Q");array.add("方块Q");
//        array.add("红桃K");array.add("黑桃K");array.add("梅花K");array.add("方块K");
        String[] col={"♥","♠","♦","♣"};
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String c:col)
            for (String n:num)
            {
                array.add(c+n);
            }



        //洗牌
        Collections.shuffle(array);
//       创建三组牌==代表三个人
        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar2 = new ArrayList<>();
        ArrayList<String> ar3 = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();
        //发牌
        int flag=0;
        for (int i=0;i<array.size();i++)
        {

            if(i<3){di.add(array.get(i));continue;}
            if(flag%3==0)
                ar1.add(array.get(i));
            else if(flag%3==1)
                ar2.add(array.get(i));
            else ar3.add(array.get(i));
            flag++;
        }
        //遍历三组卡牌,集合嵌套遍历
        TreeMap<String,ArrayList<String>> hm = new TreeMap<String,ArrayList<String>>();
        hm.put("第一组卡牌",ar1);
        hm.put("第二组卡牌",ar2);
        hm.put("第三组卡牌",ar3);
        hm.put("底牌",di);
        Set<String> key = hm.keySet();
        for(String a:key)
        {
            ArrayList<String> val=hm.get(a);
            System.out.println();
            System.out.println(a+":");
            for (String b:val)
                System.out.print("\t"+b);
        }



    }
}
