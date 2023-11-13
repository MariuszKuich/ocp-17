package pl.mariuszk.chapter_6_class_design;

public class Platypus extends Mammal {

    @Override
    String chew() {
        return "yummy!";
    }

    public static void main(String[] args) {
        new Platypus();
    }
}

abstract class Mammal {

    abstract CharSequence chew();

    Mammal() {
        // implementation of the `chew` method will be available at runtime, so the following compiles
        System.out.println(chew());
    }
}
