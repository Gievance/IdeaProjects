package Zip;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class Uncode {
    public static ArrayList<Path> uncode(Path path) throws IOException {
        String glob="glob:**/*.txt";
        ArrayList<Path> paths = new ArrayList<>();
        PathMatcher pm = FileSystems.getDefault().getPathMatcher(glob);
        Files.walkFileTree(path,new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (pm.matches(file))
                    paths.add(file);
                return FileVisitResult.CONTINUE;
            }
        });
        System.out.println(paths);

        return paths;
    }
}
