package pl.mariuszk.chapter_4_core_apis;

public class StringPool {

    public static void main(String[] args) {
        // string pool examples
        // the string pool contains literal values and constants that appear in the program
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y);     // true

        var x1 = "Hello World";
        var y1 = " Hello World".trim();
        System.out.println(x1 == y1);   // false - strings aren't equal at compile time,
                                        // so two separate strings are created in the string pool

        var x2 = "Hello World";
        var y2 = "Hello ";
        y2 += "World";
        System.out.println(x2 == y2);   // false - calling += is just like calling a method and results in a new String

        var x3 = "Hello World";
        var y3 = new String("Hello World");
        System.out.println(x3 == y3);   // false - using String constructor forces JVM to create a new string in the string pool

        // intern() method will use an object in the string pool if one is present
        var x4 = "Hello World";
        var y4 = new String("Hello World").intern();
        System.out.println(x4 == y4);   // true

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + 1;
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);                    // true - 'first' and 'second' variables
                                                                // contain the same compile-time constant
        System.out.println(first == second.intern());           // true
        System.out.println(first == third);                     // false - using String constructor means we no longer
                                                                // have a compile-time constant and 'third' does not
                                                                // point to a reference in the string pool
        System.out.println(first == third.intern());            // true
    }
}
