package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

// These common methods are available in classes that implement the `Collection` interface.
public class CommonCollectionsAPI {

    public static void main(String[] args) {
        // add() inserts a new element into the collection and returns whether the operation was successful.
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("John"));
        System.out.println(list.add("John"));
        Collection<String> set = new HashSet<>();
        System.out.println(set.add("John"));
        System.out.println(set.add("John"));
        System.out.println("----");

        // remove() removes a single element from the collection and returns whether the operation was successful.
        System.out.println(list.remove("Joe"));
        System.out.println(list.remove("John"));
        System.out.println(list);
        System.out.println("----");

        // isEmpty() and size() are straightforward
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("----");

        // clear() discards all elements of the collection
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("----");


    }
}
