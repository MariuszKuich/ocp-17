package pl.mariuszk.chapter_5_methods.access_modifiers.pond.swan;

import pl.mariuszk.chapter_5_methods.access_modifiers.pond.shore.Bird;

public class Swan extends Bird {

    public void swim() {
        floarInWater();             // protected access is ok - inheritance
        System.out.println(text);   // protected access is ok - inheritance
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floarInWater();               // protected access is ok - Swan class is allowed to use protected members of
                                            // the Bird class and we're referring to the Swan object (Swan object is called in
                                            // the Swan class - it's important, this is why it works here)
        System.out.println(other.text);     // protected access is ok
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater();               // does not compile - in this scenario the rules for the reference type
                                            // of the variable are what matter (Bird is in different package and this code
                                            // isn't inheriting from Bird)
//        System.out.println(other.text);     // does not compile
    }
}
