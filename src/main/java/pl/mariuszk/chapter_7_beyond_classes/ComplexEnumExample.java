package pl.mariuszk.chapter_7_beyond_classes;

enum ComplexEnum {

    // values must end with a semicolon
    // whether the enum is simple or complex, the list of values always comes first
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");

    // enum values should be immutable (this is why this field is marked as final), but it is not a requirement
    private final String expectedVisitors;

    // enum constructor will not compile if it contains a public or protected access modifier
    // enum constructors are implicitly private with the modifier being optional
    ComplexEnum(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

public class ComplexEnumExample {

    public static void main(String[] args) {
        // calling enum method
        ComplexEnum.SUMMER.printExpectedVisitors();

        // overridden version of the method is used
        System.out.println(Method.FALL.getName());
        // default method implementation is used
        System.out.println(Method.WINTER.getName());

        // specific interface method implementation is used
        System.out.println(EnumInterface.SPRING.getTemperature());
        // default interface method implementation is used
        System.out.println(EnumInterface.SUMMER.getTemperature());
    }
}

// enum can contain an abstract method that is overridden for every value
enum AbstractMethod {
    FALL {
        @Override
        String getName() {
            return "Fall";
        }
    },
    WINTER {
        @Override
        String getName() {
            return "Winter";
        }
    };

    abstract String getName();
}

// enum can also contain a method with default implementation overridden only for some values
enum Method {
    FALL {
        @Override
        String getName() {
            return "Fall";
        }
    },
    WINTER;

    String getName() {
        return name();
    }
}

// enum can also implement an interface
interface Temp {
    int getTemperature();
}

// there can be a single implementation for all values or individual implementations for every value
enum EnumInterface implements Temp {
    SPRING {
        @Override
        public int getTemperature() {
            return 15;
        }
    },
    SUMMER;

    public int getTemperature() {
        return 0;
    }
}