package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {
        // Supplier is used for generating / supplying values without taking any input
        Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
        System.out.println(dateSupplier.get());

        // Consumer is used when you want to do something with the parameter but not return anything
        // BiConsumer does the same thing, but it accepts two parameters (parameters can be of the same or different types)
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Hello, ");
        c2.accept("world!");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> bc1 = map::put;
        BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k, v);
        bc1.accept("k1", 1);
        bc2.accept("k2", 2);
        System.out.println(map);

        // Predicate is often used when filtering or matching
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String, String> bp1 = String::startsWith;
        BiPredicate<String, String> bp2 = (s1, s2) -> s1.startsWith(s2);
        System.out.println(bp1.test("test", "te"));
        System.out.println(bp2.test("test", "te"));

        // Function is often used for transforming a value and returning it with a different type
        // (but the type can also remain the same)
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("apple"));
        System.out.println(f2.apply("apple"));

        BiFunction<String, String, String> bf1 = String::concat;
        BiFunction<String, String, String> bf2 = (s1, s2) -> s1.concat(s2);
        System.out.println(bf1.apply("App", "le"));
        System.out.println(bf2.apply("App", "le"));

        // UnaryOperator and BinaryOperator are special cases of a Function. All parameters must be of the same type.
        // UnaryOperator transforms a value into one of the same type (e.g. decrementing a number).
        // BinaryOperator merges two values into a new one of the same type (e.g. subtracting two numbers).
        UnaryOperator<String> o1 = String::toLowerCase;
        UnaryOperator<String> o2 = x -> x.toLowerCase();
        System.out.println(o1.apply("HI"));
        System.out.println(o2.apply("HI"));

        BinaryOperator<Integer> bo1 = Integer::sum;
        BinaryOperator<Integer> bo2 = (i1, i2) -> i1 + i2;
        System.out.println(bo1.apply(1, 1));
        System.out.println(bo2.apply(2, 2));
    }
}

