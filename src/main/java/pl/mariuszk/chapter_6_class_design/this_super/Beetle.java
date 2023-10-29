package pl.mariuszk.chapter_6_class_design.this_super;

public class Beetle extends Insect {

    // variable hiding - variable type can also be changed
    protected String numberOfLegs = "6";

    // method type cannot be changed - compiler error
//    protected String walk() {
//        return "Walking!";
//    }

    public static void main(String[] args) {
        Beetle b = new Beetle();
        System.out.println(b.numberOfLegs);
        b.walk();
    }
}
