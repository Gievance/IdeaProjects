package com.NIO;

import java.io.File;
import java.nio.file.*;

//了解Path类
public class PathTest1 {
    public static void main(String[] args) {
//       获取Path的方法一
        Path path = FileSystems.getDefault().getPath("s:/ctf", "test1.txt");
//        获取Path 的方法二
        File file = new File("s:/ctf/test1.txt");
        Path path1 = file.toPath();
//        获取Path方法三
        Path path2 = Paths.get("s:/ctf/test1.txt");


//        default Path 	resolve​(String other)
//一个给定的路径字符串转换为 Path并解析它针对此 Path在完全按规定的方式 resolve方法。
//      Path 	resolve​(Path other)
//根据此路径解析给定路径。
//        合并两个Path
        Path path3 = Paths.get("s:/ctf");
        Path resolve = path3.resolve("test1.txt");
        System.out.println(resolve);//s:\ctf\test1.txt


//   static   boolean   isReadable(Path path)
        if (Files.isReadable(path))
        {
            System.out.println("is Readable");
        }
        else System.out.println("is not Readable");
    }
}
