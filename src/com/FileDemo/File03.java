package com.FileDemo;
//测试File的获取和判断功能

import java.io.File;

public class File03 {
    public static void main(String[] args) {
        File f1=new File("s:\\FileDemo\\java.txt");
//        public boolean isDirectory( )
//        测试此抽象路径名表示的File，是否为目录
//        public boolean isFile( )
//        测试此抽象路径名表示的File，是否为文件
//        public boolean exists( )
//        测试此抽象路径名表示的File, 是否存在
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

//        public String getAbsolutePath( )
//        返回此抽象路径名的绝对路径字符串

//        public String getPath( )
//        将此抽象路径名转换为路径名字符串
//        public String getName( )
//        返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("--------------");
//        public String[ ]  list( )
//        返回此抽象路径名表示的目录,中的文件和目录的名称字符串数组
//        public File[ ] listFiles( )
//        返回此抽象路径名表示的目录,中的文件和目录的File对象数组
        File f2 = new File("s:\\FileDemo");
        String[] list = f2.list();//获取的是字符串，无法进行判断
        for(String s:list)
            System.out.println(s);
        System.out.println("----------------------");
        File[] files = f2.listFiles();//listFiles 可进行file类型的判断
        for(File f:files)
        {
            File fd=f;
            System.out.println(fd.getPath());
        }
    }
}
