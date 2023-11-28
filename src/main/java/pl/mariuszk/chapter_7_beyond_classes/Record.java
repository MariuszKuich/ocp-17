package pl.mariuszk.chapter_7_beyond_classes;


record Crane(int numberEggs, String name) {
    // record may declare optional constructors, methods and constants
}

// a record without any field is valid (but not really useful)
record Crane2() { }

// records are implicitly final
// the final keyword is optional but assumed
final record Crane3() { }

record Crane4(int numberEggs, String name) {

    // the following is a long constructor - a constructor that the compiler normally inserts automatically
    // every record's field is final so the constructor must set every field
    Crane4(int numberEggs, String name) {
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

public class Record {
    public static void main(String[] args) {
        // constructor parameters are in the same order as in the record declaration
        Crane c = new Crane(10, "Andrew");
        System.out.println(c.numberEggs());
        System.out.println(c.name());
    }
}
