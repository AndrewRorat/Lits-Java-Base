package homeWork16;

import java.util.HashMap;
import java.util.Map;

public final class StringUtils {
    public static void main(String[] args) {
        String stringa = "svndifvas;orbfan;t";

    count(stringa);
    }

    public static Map<Object, Object> count(String stringa) {
        String[] split = stringa.split("");
        var map = new HashMap<>();
        for (String letter : split) {
            if (!letter.isEmpty()) {
                Integer counter = (Integer) map.get(letter);
                if (counter == null) {
                    counter = 0;
                }
                map.put(letter, ++counter);
            }
        }
        for (Object letter : map.keySet()) {
            System.out.println(letter + ": " + map.get(letter));
        }
        return map;
    }
}
