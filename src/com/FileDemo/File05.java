package com.FileDemo;
//递归解决
public class File05 {
    public static void main(String[] args) {
//        System.out.println(f(20));
        System.out.println(f2(4));
    }
    public static int f(int n){
        if(n==1||n==2)
            return 1;
        else  return f(n-1)+f(n-2);
    }
    public static int f2(int n){
       if(n==1)
           return 1;
       else
           return n*f(n-1);
    }
}
