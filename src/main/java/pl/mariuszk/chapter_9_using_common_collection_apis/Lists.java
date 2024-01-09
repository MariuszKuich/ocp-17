package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {
        // LinkedList and ArrayList have two basic constructors - one for creating an empty collection and one for creating
        // a copy of another collection.
        var list1 = new LinkedList<String>();
        var lsit2 = new LinkedList<String>(list1);

        // ArrayList have one additional constructor for creating a collection with specific initial size.
        var list3 = new ArrayList<String>(3);

        // Fun fact: the following does compile and creates a collection of Object objects.
        var list4 = new ArrayList<>();
        list4.add("a");
        list4.add(1);
        System.out.println(list4);
    }
}
