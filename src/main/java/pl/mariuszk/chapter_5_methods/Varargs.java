package pl.mariuszk.chapter_5_methods;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        // valid ways to call a method using varargs
        test("a", "b", "c");
        test(new String[] {"d", "e", "f"});
        // an array of 0 length is created
        test();
    }

    static void test(String... params) {
        System.out.println(Arrays.toString(params));
    }
}
