package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

    public static void main(String[] args) {
        var dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Bella"));
        dogs.add(new Dog("Azor"));
        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println("Sorted: " + dogs);
    }
}

class Dog implements Comparable<Dog> {

    private final String name;

    Dog(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    // When two object are equal the method should return 0.
    // When current object is smaller than the argument the method should return a negative number.
    // When current object is larger than the argument the method should return a positive number.
    @Override
    public int compareTo(Dog d1) {
        return name.compareTo(d1.name);
    }
}