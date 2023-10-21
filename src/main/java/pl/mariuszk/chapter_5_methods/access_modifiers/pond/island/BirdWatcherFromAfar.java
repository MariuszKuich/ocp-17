package pl.mariuszk.chapter_5_methods.access_modifiers.pond.island;

import pl.mariuszk.chapter_5_methods.access_modifiers.pond.shore.Bird;

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();            // does not compile - no inheritance nor same package
//        System.out.println(bird.text);  // does not compile - no inheritance nor same package
    }
}
