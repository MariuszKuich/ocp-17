package pl.mariuszk.chapter_5_methods.access_modifiers.pond.goose;

import pl.mariuszk.chapter_5_methods.access_modifiers.pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floarInWater();               // protected access is ok - see Swan class
        System.out.println(other.text);     // protected access is ok
    }

    protected void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater();               // does not compile - similar scenario to the Swan class (the object happens
                                            // to be a Goose but it's the reference type what matters)
//        System.out.println(other.text);     //does not compile
    }
}
