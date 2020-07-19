package com.NIO;

import javax.naming.directory.BasicAttribute;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class 目录迭代之walkFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("e:/FileDemo");
//        read(path);
//    read2(path);
//    read3(path);
        Path src=Paths.get("e:/JavaApplet");
        Path target = Paths.get("e:/FileDemo");
        copyOfFile(src,target);
    }

// 验证结果一：simpleFileVisitor重写方法里的参数Path来源？ 来自walkFileTree的Path
    public  static void read(Path path) throws IOException {
//        遍历文件
        Files.walkFileTree(path, new SimpleFileVisitor<Path>()
                {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        System.out.println(file);
                        return FileVisitResult.CONTINUE;
                    }
                }
        );
    }
    public static void read2(Path path) throws IOException {
        Files.walkFileTree(path,new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.endsWith("file.txt"))
//                        匹配的是路径节点的完整内容==特定的文件，明确文件名称
                {
                    System.out.println(file.getFileName());
                }
                return FileVisitResult.TERMINATE;
            }
        });
    }
    public static void read3(Path path) throws IOException {
        String glob="glob:***.{jpg,txt}";
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        Files.walkFileTree(path,new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (pathMatcher.matches(file))
                    System.out.println(file.getFileName());
                return FileVisitResult.CONTINUE;
            }
        });
    }
    public static void copyOfFile(Path src, Path target) throws IOException {
        if (!Files.isDirectory(src,LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("源文件不是目录");
        }

        Files.walkFileTree(src, new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Path tar;
                tar=dir.compareTo(src)==0?target.resolve(src.getFileName()):target.resolve(dir.subpath(src.getNameCount()-1,dir.getNameCount()));
                Files.createDirectories(tar);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
               Files.copy(file,target.resolve(file.subpath(src.getNameCount()-1,file.getNameCount())));
               // src.getNameCount()-1 ，使其创建父目录。否则就是单纯的文件复制
                        return FileVisitResult.CONTINUE;

            }
        });

    }
}
