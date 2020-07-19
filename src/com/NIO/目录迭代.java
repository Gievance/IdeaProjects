package com.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class 目录迭代 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("e:/FileDemo");
        search(path);
//Interface DirectoryStream<T>   --DirectoryStream是一个带泛型的接口
//   如何获取DirectoryStream 对象？  Files.newDirectoryStream() 获取
// 方法一：public static DirectoryStream<Path> newDirectoryStream​(Path dir) throws IOException
//        返回泛型为Path（目录流iterator返回的是Path）的 DirectoryStream。参数为目录
// 方法二：public static DirectoryStream<Path> newDirectoryStream​(Path dir, String glob)
//         迭代器返回的条目通过匹配给定的globbing模式的文件名的String表示来过滤。
// 方法三：public static DirectoryStream<Path> newDirectoryStream​(Path dir, DirectoryStream.Filter<? super Path> filter)
//         迭代器返回的条目由给定的filter过滤。
    }

    public static void search(Path path) throws IOException {
        DirectoryStream<Path> paths = Files.newDirectoryStream(path);
        for (Path d : paths) {
//            进行迭代，尝试遍历所有文件
            if(Files.isDirectory(d)) {
                System.out.println(d.toString());
                search(d);
            }
            else
                 System.out.println(d.toString());
        }
//        newDirectoryStream()遍历的是给定path目录下的文件
    }
}
