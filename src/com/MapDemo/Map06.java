package com.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map06 {
    public static void main(String[] args) {
        Map<Integer,Student> m=new HashMap<Integer, Student>();
        Student s1 = new Student(1, "白纸", 10);
        Student s2 = new Student(2, "黑子", 11);
        Student s3 = new Student(3, "龙子", 12);
        Student s4 = new Student(4, "混子", 12);
        m.put(1,s1);
        m.put(2,s2);
        m.put(3,s3);
        m.put(3,s4);
//        方式一
        Set<Integer> k=m.keySet();
        for(Integer i:k)
        {
            Student s=m.get(i);
            System.out.println(i+":"+s.getName()+"已经"+s.getAge()+"岁");
        }
        System.out.println("------------------------------");
//        方式二
        Set<Map.Entry<Integer, Student>> map = m.entrySet();
        for (Map.Entry<Integer,Student> s:map)
        {
            int key=s.getKey();
            Student stu =s.getValue();
            System.out.println(key+":"+stu.getName()+"已经"+stu.getAge()+"岁");
        }
    }
}
