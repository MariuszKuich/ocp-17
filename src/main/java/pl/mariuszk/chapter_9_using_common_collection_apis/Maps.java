package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.IntToDoubleFunction;

public class Maps {

    public static void main(String[] args) {
        // Creating immutable maps.
        Map<String, String> m1 = Map.of("k1", "v1", "k2", "v2");
        Map<String, String> m2 = Map.ofEntries(Map.entry("k1", "v1"), Map.entry("k2", "v2"));
        Map<String, String> m3 = Map.copyOf(m1);

        // putIfAbsent() updates an entry with existing key, but null value
        Map<String, String> putMap = new HashMap<>();
        putMap.put("1", "11");
        putMap.put("2", null);
        putMap.putIfAbsent("2", "22");
        putMap.putIfAbsent("3", "33");
        System.out.println(putMap);

        // merge() function
        Map<Integer, Integer> mergeMap = new HashMap<>();
        mergeMap.put(1, 1);
        mergeMap.put(2, null);
        BiFunction<Integer, Integer, Integer> func1 = (v1, v2) -> v1 > v2 ? v1 : v2;
        mergeMap.merge(1, 11, func1);
        mergeMap.merge(2, 2, func1);
        mergeMap.merge(3, 3, func1);
        System.out.println(mergeMap);

        BiFunction<Integer, Integer, Integer> func2 = (v1, v2) -> null;
        mergeMap.merge(1, 111, func2);
        System.out.println(mergeMap);
    }
}
