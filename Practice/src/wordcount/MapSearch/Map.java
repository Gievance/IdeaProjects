package wordcount.MapSearch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    public static void show(HashMap<String,Integer> map)
    {
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext())
        {
            String key = iterator.next();
            Integer integer = map.get(key);
            System.out.println(key+":"+integer);
        }

    }
}
