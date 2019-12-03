package homeWork18;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class SwapMap {
    public static void main(String[] args) {
        final var persons = new HashMap<String, Integer>();
        persons.put("Adolf", 25);
        persons.put("Tim", 12);
        persons.put("Lilia", 28);

        System.out.println(swapMap(persons));

    }

    public static Map<Object, Object> swapMap(HashMap<String, Integer> map) {
        Map<Object, Object> i = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        return i;
    }
}

final class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}