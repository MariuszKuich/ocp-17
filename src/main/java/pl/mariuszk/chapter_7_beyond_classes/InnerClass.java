package pl.mariuszk.chapter_7_beyond_classes;

// Inner classes:
// can be declared public, protected, package-private or private,
// can extend a class and implement an interface,
// can be marked as abstract or final,
// can access members of the outer class, including private members
public class InnerClass {

    private String caption = "Hello";

    class InnerClassExample {
        // outer class instance member can be accessed
        void greet() {
            for (int i = 0; i < 2; i++) {
                print(caption);
            }
        }

        // inner types can have static methods
        private static void print(String caption) {
            System.out.println(caption);
        }
    }

    void test() {
        var ice = new InnerClassExample();
        ice.greet();
    }

    public static void main(String[] args) {
        var ic = new InnerClass();
        ic.test();

        System.out.println("---");

        // instantiating an inner class
        var ice = ic.new InnerClassExample(); // wtf is this
        ice.greet();
    }
}
