package wordcount.read;

import wordcount.MapSearch.Map;
import wordcount.search.Search;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Read {
    public static ArrayList<Path> readFile(Path path) throws IOException {

        ArrayList<Path> search = Search.search(path);
        for (Path p:search)
        {
            System.out.println(p);
            if (p.getFileName().equals("english.txt"));
            {
                search.clear();
                search.add(p);
            }
        }
        return search;
    }
    public static HashMap<String, Integer> readWord(ArrayList<Path> arr) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(arr.get(0).toFile()));
        HashMap<String, Integer> map = new HashMap<>();
        String line;
        while((line=br.readLine())!=null)
        {
            String[] s = line.split(" ");
            if (s!=null&&s.length>0)
            for (String word:s)
            {
                if (!map.containsKey(word))
                    map.put(word,1);
                else {

                    map.put(word,map.get(word)+1);
                }
            }

        }
     return map;
    }
}
