package pl.mariuszk.chapter_5_methods.access_modifiers.pond.shore;

public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floarInWater();            // protected access is ok - same package
        System.out.println(bird.text);  // protected access is ok - same package
    }
}
