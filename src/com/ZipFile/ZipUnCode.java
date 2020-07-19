package com.ZipFile;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipUnCode {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/FileDemo/english.zip");
        ZipInputStream zis = new ZipInputStream(new FileInputStream(file));
        ZipEntry nextEntry = zis.getNextEntry();
        System.out.println("正在解压:"+nextEntry.getName()+"文件");
        File file1 = new File(file.getParent(), nextEntry.getName());
//        第一个参数，注意，我写错了写成file
        FileOutputStream fw = new FileOutputStream(file1);

        int temp=0;
        while((temp=zis.read())!=-1)
        {
            fw.write(temp);
        }
        System.out.println("解压结束");
        fw.close();
        zis.close();
    }
}
