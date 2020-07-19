package com.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import java.util.Iterator;

public class moveFIle {
    //    E:\FileDemo\SonofSun.txt 的文件移动到同目录下SonofSun.txt
//    采用Files.move方法。并更名movefile.txt
    public static void main(String[] args) throws IOException {
//       moveBymove();//文件移动
//       fileAttributes();//获取文件属性
        createDictory();//创建目录以及遍历特定文件
    }

    private static void createDictory() throws IOException {
        Path path = Paths.get("e:/FileDemo/temp");
        if (Files.notExists(path))
        {
            Files.createDirectory(path);
            System.out.println("文件创建");
        }else {
            System.out.println("文件已存在");
        }
        Path path1 = path.resolve("a.txt");
        Path path2 = path.resolve("b.txt");
        Path path3 = path.resolve("c.txt");
        Path path4 = path.resolve("d.txt");
        Files.createDirectories(path1);
        Files.createDirectories(path2);
        Files.createDirectories(path3);
        Files.createDirectories(path4);

//        不加条件遍历
        System.out.println("---不加条件遍历--");
        DirectoryStream<Path> paths = Files.newDirectoryStream(path);
        Iterator<Path> iterator = paths.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().getFileName());
        }
        System.out.println("---加条件遍历--");
        DirectoryStream<Path> paths1 = Files.newDirectoryStream(path, "*.txt");
        for(Path p:paths1)
        {
            System.out.println(p.getFileName());
        }
    }

    private static void fileAttributes() throws IOException {
        Path path = Paths.get("e:/FileDemo");
        System.out.println(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
//   获取文件的属性
        BasicFileAttributes bas = Files.readAttributes(path, BasicFileAttributes.class);
//            使用type参数BasicFileAttributes.class调用此方法不会抛出UnsupportedOperationException 。
        System.out.println(bas.isDirectory());
        System.out.println(new Date(bas.lastModifiedTime().toMillis()));
//  BasicFileAttributes.creationTime 返回创建时间
//  BasicFileAttributes.lastModifiedTime 返回上次修改时间

    }


    private static void moveBymove() throws IOException {
        Path src = Paths.get("e:/FileDemo", "SonofSun.txt");
//        Path tar = Paths.get(String.valueOf(src.getParent()), "movefile.txt");
//        或写成拼接的形式
        Path tar = src.getParent().resolve("movefile.txt");
        Files.move(src, tar);
    }
}
