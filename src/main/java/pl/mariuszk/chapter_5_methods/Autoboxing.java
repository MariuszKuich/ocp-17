package pl.mariuszk.chapter_5_methods;

public class Autoboxing {

    public static void main(String[] args) {
        Short tail = 8;         // autoboxing
        Character p = Character.valueOf('p');
        char paw = p;           // unboxing
        Boolean nose = false;   // autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e;          // unboxing, then implicit casting

        // Pay attention: Java will not both autobox and cast smaller primitive to a larger type at the same time
        // the following does not compile
//        Long badGorilla = 9;
    }
}
