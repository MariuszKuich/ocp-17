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

    // an example of referencing members of inner classes
    class A {
        private int x = 10;
        class B {
            private int x = 20;
            class C {
                private int x = 30;
                void printAllX() {
                    System.out.println("C: " + this.x);
                    System.out.println("B: " + B.this.x);
                    System.out.println("A: " + A.this.x);
                }
            }
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
        InnerClass.InnerClassExample ice = ic.new InnerClassExample(); // wtf is this
        ice.greet();

        System.out.println("---");
        A.B.C abc = new InnerClass().new A().new B().new C();
        abc.printAllX();
    }
}
