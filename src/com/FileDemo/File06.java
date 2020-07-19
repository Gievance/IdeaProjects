package com.FileDemo;

public class File06 {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }
    public static int jc(int c){
        if(c==1)
            return 1;
        else
            return c*jc(c-1);
    }
}
