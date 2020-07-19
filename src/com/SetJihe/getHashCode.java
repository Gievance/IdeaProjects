package com.SetJihe;

public class getHashCode {
    public static void main(String[] args) {
//        public int hashCode()
        Student t1=new Student(16,"小白龙");
        Student t2 = new Student(19, "林允");

        System.out.println(t1.hashCode());//1060830840
        System.out.println(t2.hashCode());//2137211482
        //也可以重写hashCode方法
        String s="Wholrd";

    }
}
