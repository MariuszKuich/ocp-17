package pl.mariuszk.chapter_5_methods;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        // valid ways to call a method using varargs
        test("a", "b", "c");
        test(new String[] {"d", "e", "f"});
        // an array of 0 length is created
        test();
        // explicitly setting varargs parameter to null
        test(null);
    }

    static void test(String... params) {
        if (params == null) {
            System.out.println("params is null");
            return;
        }
        // accessing varargs elements
        if (params.length >= 1) {
            System.out.println(params[1]);
        }
        System.out.println(Arrays.toString(params));
    }
}
