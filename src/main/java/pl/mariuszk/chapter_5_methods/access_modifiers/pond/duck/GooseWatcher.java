package pl.mariuszk.chapter_5_methods.access_modifiers.pond.duck;

import pl.mariuszk.chapter_5_methods.access_modifiers.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater();           // does not compile - only Goose is allowed to call floatInWater(), not callers of Goose
    }
}
