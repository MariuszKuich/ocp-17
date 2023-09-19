package pl.mariuszk.chapter_2_operators;

public class InstanceOf {

    public void openZoo(Number time) {
        /*
        INVALID - compiler can determine that the 'time' variable would never be an instance of String
        if (time instanceof String) {
            System.out.println(time);
        }
        INVALID
        boolean aNull = null instanceof null;
        */
    }
}
