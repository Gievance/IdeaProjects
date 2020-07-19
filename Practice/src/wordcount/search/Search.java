package wordcount.search;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class Search {
    public static ArrayList<Path> search(Path path) throws IOException {
        ArrayList<Path> paths = new ArrayList<>();
        String glob="glob:**/*.txt";
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        Files.walkFileTree(path, new SimpleFileVisitor<>()
        {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (pathMatcher.matches(file))
                    paths.add(file);
                return FileVisitResult.CONTINUE;
            }
        });
        return paths;
    }
}
