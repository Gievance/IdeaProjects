package com.IO;

import java.io.File;

public class dictoryBylist {
    public static void showBylist(File f){
        String[] list = f.list();
        for (String s:list)
        {
            File f2 = new File(f, s);
            if (f2.isDirectory()) {
                System.out.println(f2.getPath());
                showBylist(f2);
            }
            else System.out.println(f2.getPath());

        }
    }

    public static void main(String[] args) {
        File f = new File("e:/FileDemo");
//        showBylist(f);//利用File.list()遍历目录
//        showBylist2(f);

    }

    private static void showBylist2(File f) {
        String[] list = f.list( (file,s) -> s.endsWith(".txt"));
        for (String s:list)
        {
            File f2 = new File(f,s);
            if (f2.isDirectory())
            {
                System.out.println(f2.getPath());
                showBylist2(f2);
            }
            else
                System.out.println(f2.getPath());
        }

    }
}
