package com.Fanxing;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class UseFanXing {
    public static void main(String[] args) {
        List<String> li= Arrays.asList("Hello","This","is","a","beautiful");
//        li.add("插入");
//        li.remove("This");
//        UnsupportedOperationException
        li.set(1,"修改");
        System.out.println(li);



        List<String> li2=List.of("Hello","This","is","a","beautiful");
//        li2.add("插入");
//        li2.remove("This");
//        UnsupportedOperationException
//        li2.set(1,"修改");
//        UnsupportedOperationException
        System.out.println(li);


        Set<String> li3=Set.of("Hello","This","is","a","beautiful");
//        li3.add("插入");
//        li3.remove("This");
//        UnsupportedOperationException
//        li3.set(1,"修改");
//        UnsupportedOperationException
        System.out.println(li);
    }
}
