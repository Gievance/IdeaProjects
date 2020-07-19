package com.UserdesignReverArray;

public class ReverseArrayDemo {
    public static void main(String[] args) {
     int[] array={1,2,3,4,5,6};
     int[] temp=ReverseArray.ReverArray(array);
     for(int i:temp)
     {
         System.out.print(i);
     }
        System.out.println();
     String[] string={"Hello","World","this","is","a","test"};
     String[] tempString=ReverseArray.ReverStringArr(string);
     for(String i:tempString)
     {
         System.out.print(i+"  ");
     }
        System.out.println();
        String s="Hello,MyBaby";
        String rs=ReverseArray.ReverString(s);
        System.out.print(rs);
    }
}
