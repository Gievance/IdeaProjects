package com.IO;

import java.io.File;
import java.util.Date;

public class fileMethod {
    public static void main(String[] args) {
        File f1 = new File("e:/FileDemo/movefile.txt");
        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs Path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exist");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
        p(f1.isFile() ? "is normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + new Date(f1.lastModified()).toString());
        p("File size: " + f1.length() + " Bytes");
//        boolean renameTo(File newName)
        File fname = new File("SonofSun.txt");
        System.out.println(f1.renameTo(fname));
//        boolean delete( )

    }

    static void p(String s) {
        System.out.println(s);
    }
}
