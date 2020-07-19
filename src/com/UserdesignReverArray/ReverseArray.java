package com.UserdesignReverArray;

public class ReverseArray {
    //int型
    public static int[] ReverArray(int[] arrs)
    {
        int[] temp1=new int[arrs.length];
        for (int i=arrs.length-1;i>=0;i--)
            temp1[arrs.length-i-1]=arrs[i];
        return temp1;
    }
    //String[]
    public static String[] ReverStringArr(String[] str)
    {
        String[] temp2=new String[str.length];
        for(int i=str.length-1;i>=0;i--)
            temp2[str.length-i-1]=str[i];
        return temp2;
    }
    //String
    public static String ReverString(String s)
    {
        int len=s.length();
        char[] temp=new char[len];
        for(int i=len-1;i>=0;i--)
        {
            temp[len-i-1]=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:temp)
        {
            sb=sb.append(c);
        }
        return sb.toString();
    }
}
