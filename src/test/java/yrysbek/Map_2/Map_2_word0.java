package yrysbek.Map_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Map_2_word0 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i = 0;i<strings.length;i++){
            map.put(strings[i], 0);
        }
        return map;
    }

    @Test
    public void testWord0(){
        String[] strings1 = {"a", "b", "a", "b"};
        Map<String, Integer> map = new HashMap<>();
        map.put("a",0);
        map.put("b",0);
        Map expectedValue1 = map;

        Assertions.assertEquals(expectedValue1,word0(strings1));


        String[] strings2 = {"a", "b", "a", "c", "b"};
        map.clear();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);
        Map expectedValue2 = map;

        Assertions.assertEquals(expectedValue2,word0(strings2));


        String[] strings3 = {"c", "b", "a"};
        map.clear();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);
        Map expectedValue3 = map;

        Assertions.assertEquals(expectedValue3,word0(strings3));

    }

}
