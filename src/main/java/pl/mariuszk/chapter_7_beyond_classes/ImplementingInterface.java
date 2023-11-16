package pl.mariuszk.chapter_7_beyond_classes;

interface Climb {
    Number getSpeed(int age);
}

interface CanBurrow {
    Float getSpeed(int age);
}

interface NotCompatible {
    String getSpeed(int age);
}

public class ImplementingInterface implements Climb, CanBurrow {

    public Float getSpeed(int age) {
        return 0f;
    }
}

// not compatible methods declarations in interfaces
//public class ImplemetingMultipleInterfaces implements CanBurrow, NotCompatible { }