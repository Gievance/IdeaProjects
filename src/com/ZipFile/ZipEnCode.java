package com.ZipFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipEnCode {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/FileDemo/english.txt");
        File zipFile = new File("e:/FileDemo/english.zip");

        FileReader fr = new FileReader(file);
        ZipOutputStream zip=new ZipOutputStream(new FileOutputStream(zipFile));
        zip.putNextEntry(new ZipEntry(file.getName()));
        zip.setComment("单一文件压缩");

        int temp=0;
        while((temp=fr.read())!=-1)
        {
            zip.write(temp);
        }
        fr.close();
        zip.close();
    }



    public static ArrayList<Path> search(Path path) throws IOException {
        ArrayList<Path> paths = new ArrayList<>();
        String glob="glob:**/*.txt";
        PathMatcher pm = FileSystems.getDefault().getPathMatcher(glob);
        Files.walkFileTree(path,new SimpleFileVisitor<>()
        {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (pm.matches(file))
                    paths.add(file);
            return FileVisitResult.CONTINUE;
            }
        });
        return paths;
    }
}
