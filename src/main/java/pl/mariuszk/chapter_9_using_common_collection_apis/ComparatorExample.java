package pl.mariuszk.chapter_9_using_common_collection_apis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        // Comparator is a functional interface
        Comparator<Cat> comparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat c1, Cat c2) {
                return c1.getAge() - c2.getAge();
            }
        };
        comparator = (c1, c2) -> c1.getAge() - c2.getAge();

        // Comparator.comparing() static helper method can also be used
        comparator = Comparator.comparing(Cat::getAge);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(3));
        cats.add(new Cat(2));
        cats.add(new Cat(1));
        System.out.println(cats);
        cats.sort(comparator);
        System.out.println(cats);
    }
}

class Cat {

    private int age;

    int getAge() {
        return age;
    }

    Cat(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }
}
