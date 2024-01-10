package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.ArrayList;
import java.util.Arrays;
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

        // replaceAll() method
        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(n -> n * 2);
        System.out.println(numbers);

        // Remember: the remove() method is overloaded for lists. Original method (from the Collection interface) removes
        // a matching element; the remove() method for lists removes an element at specific index.
        var removeList = new ArrayList<Integer>();
        removeList.add(1);
        removeList.add(2);
        removeList.add(5);
        removeList.remove(1); // remove at index - removes 2
        removeList.remove(Integer.valueOf(1)); // remove matching element - removes 1
        System.out.println(removeList);

        // Converting a list to an array: created array is a copy and it has no relationship to the original list.
        var arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        Object[] objArr = arrList.toArray();
        String[] strArr = arrList.toArray(new String[0]); // creates an array of proper size
        String[] strArr1 = arrList.toArray(new String[10]); // creates an array of fixed size
        String[] strArr2 = arrList.toArray(new String[1]); // suggested size is too small - Java figures out the correct size
        arrList.clear();
        System.out.println(strArr.length);
        System.out.println(strArr1.length);
        System.out.println(strArr2.length);
    }
}
