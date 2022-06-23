package yrysbek;

import java.util.HashMap;
import java.util.Map;

public class Map_2_word0 {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "b"};
        System.out.println(word0(strings)); // {"a": 0, "b": 0}
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i = 0;i<strings.length;i++){
            map.put(strings[i], 0);
        }
        return map;
    }
}
