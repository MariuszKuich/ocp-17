package pl.mariuszk.chapter_5_methods;

public class PassingObjects {

    public static void main(String[] args) {
        Example example = new Example(1, 2);
        // a copy of the reference to the object is passed
        pass(example);

        System.out.println(example.a);
        System.out.println(example.b);

        String str = "abc";
        passString(str);
        System.out.println(str);
    }

    static void pass(Example e) {
        e = new Example(3, 4);
    }

    static void passString(String str) {
        str += "d";
    }
}

class Example {
    int a;
    int b;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
