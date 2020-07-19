package wordcount.Demo;

import wordcount.MapSearch.Map;
import wordcount.read.Read;
import wordcount.search.Search;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class demo {
    public static void main(String[] args) throws IOException {
        ArrayList<Path> paths = Read.readFile(Paths.get("e:/FileDemo"));
        HashMap<String, Integer> map = Read.readWord(paths);
        Map.show(map);
    }
}
