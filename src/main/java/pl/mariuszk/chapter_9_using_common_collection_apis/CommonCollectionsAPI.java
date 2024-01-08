package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.*;

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

        // isEmpty() and size() are straightforward.
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("----");

        // clear() discards all elements of the collection.
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("----");

        // contains() calls equals() on objects to look for matches.
        list.add("David");
        System.out.println(list.contains("David"));
        System.out.println("----");

        // removeIf() accepts a Predicate and removes all elements that meet the condition.
        list.add("Dawid");
        list.removeIf(s -> s.contains("v"));
        System.out.println(list);
        System.out.println("----");

        // forEach() accepts a Consumer.
        list.add("Andrew");
        list.forEach(System.out::println);
        System.out.println("----");

        // equals() method accepts an Object and allows to compare the type and contents of two collections.
        // Implementations vary between collections, e.g. lists care for order, while sets do not.
        List<Integer> l1 = List.of(1, 2);
        List<Integer> l2 = List.of(2, 1);
        Set<Integer> s1 = Set.of(1, 2);
        Set<Integer> s2 = Set.of(2, 1);
        System.out.println(l1.equals(l2));
        System.out.println(s1.equals(s2));
        // Contents are the same, but the types are not, so these collections are not equal.
        System.out.println(l1.equals(s1));
    }
}
