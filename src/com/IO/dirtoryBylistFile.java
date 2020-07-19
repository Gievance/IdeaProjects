package com.IO;

import java.io.File;
import java.io.FileFilter;

public class dirtoryBylistFile {
    public static void main(String[] args) {
        File f = new File("e:/FileDemo");

//        File[ ] listFiles( )
//        show1(f);
//        File[ ] listFiles(FilenameFilter FFObj)
//        show2(f);
//        File[ ] listFiles(FileFilter FObj)
        show3(f);
    }

    private static void show3(File f) {
        File[] files = f.listFiles(ff->ff.getName().toLowerCase().endsWith(".txt"));
        for (File ff:files)
        {
            if (ff.isDirectory())
            {
                System.out.println(ff.getPath());
                show3(ff);
            }
            else
                System.out.println(ff.getPath());

        }
    }

    private static void show2(File f) {
        File[] files = f.listFiles((file, s) -> s.endsWith(".txt"));
        for (File ff:files)
        {
            if (ff.isDirectory())
            {
                System.out.println(ff.getPath());
                show2(ff);
            }
            else
                System.out.println(ff.getPath());

        }
    }

    private static void show1(File f) {
        File[] files = f.listFiles();
        for(File ff:files)
        {
            if (ff.isDirectory())
            {
                System.out.println(ff.getPath());
                show1(ff);
            }
            else
                System.out.println(ff.getPath());
        }
    }
}
