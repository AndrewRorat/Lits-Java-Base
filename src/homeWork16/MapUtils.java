package homeWork16;

import java.util.HashMap;
import java.util.Map;

public final class MapUtils {
    public static void main(String[] args) {


        var myMap = new HashMap<>();
        myMap.put(25, "asd");
        myMap.put(27, "zxc");
        myMap.put(32, "awe");
        myMap.put(78, "hjk");

        System.out.println(swapMap(myMap));

    }

        public static HashMap<Object, Object> swapMap (HashMap < Object, Object > map) {
            var myMap = new HashMap<>();
            for (Map.Entry<Object, Object> entry : map.entrySet()){
                myMap.put(entry.getValue(), entry.getKey());
            }return myMap;

        }
    }