package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // Creating immutable maps.
        Map<String, String> m1 = Map.of("k1", "v1", "k2", "v2");
        Map<String, String> m2 = Map.ofEntries(Map.entry("k1", "v1"), Map.entry("k2", "v2"));
        Map<String, String> m3 = Map.copyOf(m1);
    }
}
