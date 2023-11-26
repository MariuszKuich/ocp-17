package pl.mariuszk.chapter_7_beyond_classes;

// enums can have public or package-private access
// enums cannot extend another enums
enum Season {

    // semicolon at the end is optional for simple enums
    // a simple enum is an enum containing only a list of values
    WINTER, SPRING, SUMMER, FALL;
}

public class EnumExample {

    public static void main(String[] args) {
        var s = Season.SUMMER;
        // enums print the name of the enum when toString() is called
        System.out.println(s);
        // each enum value is initialized only once in the JVM so enums can be compared with == or equals()
        System.out.println(s == Season.SUMMER);

        // String must match enum name exactly
        System.out.println(Season.valueOf("WINTER"));
        // runtime error
//        System.out.println(Season.valueOf("winter"));

        // when using enums with switch statements/expressions, enum name must be omitted
        switch (s) {
            case SUMMER -> System.out.println("Summer!");
            case WINTER -> System.out.println("Winter!");
        }
    }
}