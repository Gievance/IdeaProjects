package com.FileDemo;

import java.io.File;

public class File27 {
    public static void main(String[] args) {
        File file = new File("FileDemo");
        File[] files = file.listFiles();
       for(File f:files)
       {
           File file1 = new File(f.getName(), f.getName());
           file1.delete();

       }
    }
}
