package com.Fanxing;

import java.util.ArrayList;
import java.util.List;

public class TypeSymbol {
    public static void main(String[] args) {
        //类型通配符的 <  ? >
        List<?> l1=new ArrayList<String>();
        List<?> l2=new ArrayList<Integer>();
        List<?> l3=new ArrayList<Number>();
        System.out.println("---------------");
        //类型通配符上限：< ?  extends 类型>
        List<? extends Number> l4=new ArrayList<Integer>();
//        List<? extends Number>  l5= new ArrayList<Object>();
        //类型通配符下限：< ?  super 类型>
        List<? super Number> l5=new ArrayList<Object>();
//        List<? super Number> l6 = new ArrayList<Integer>();
    }
}
