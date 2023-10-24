package pl.mariuszk.chapter_5_methods;

public class Overloading {

    public static void main(String[] args) {
        // Java always picks the most specific version of a method that it can
        print("abc");
        print(47L);
        System.out.println("---");
        print(4);
        print(Integer.valueOf(4));

        // compiler error - ambiguous method call
//        print(1, 1);
    }

    static void print(String s) {
        System.out.println("String");
    }

    static void print(Object o) {
        System.out.println("Object");
    }

    static void print(int i) {
        System.out.println("Primitive");
    }

    static void print(Integer i) {
        System.out.println("Wrapper class");
    }

    void print(int[] arr) {
    }

    // invalid - same method signature as the method above
//    void print(int... arr) {
//
//    }

    static void print(long i, int j) {
        System.out.println("Primitive long-int");
    }

    static void print(int i, long j) {
        System.out.println("Primitive int-long");
    }
}
