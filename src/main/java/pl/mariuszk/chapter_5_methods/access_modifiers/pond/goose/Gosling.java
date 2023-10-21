package pl.mariuszk.chapter_5_methods.access_modifiers.pond.goose;

import pl.mariuszk.chapter_5_methods.access_modifiers.pond.shore.Bird;

public class Gosling extends Bird {

    public void swim() {
        floarInWater();             // protected access is ok - inheritance
        System.out.println(text);   // protected access is ok - inheritance
    }
}
