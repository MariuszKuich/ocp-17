package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        // Creating immutable sets.
        Set<String> s1 = Set.of("abc", "def");
        Set<String> s2 = Set.copyOf(s1);

        // add() method returns true if object was added to set. equals() method is used to determine equality.
        Set<String> s3 = new HashSet<>();
        System.out.println(s3.add("ghi"));
        System.out.println(s3.add("ghi"));
    }
}
