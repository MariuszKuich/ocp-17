package pl.mariuszk.chapter_7_beyond_classes;

interface Walk {
    default int getSpeed() {
        return 5;
    }
}

interface Run {
    default int getSpeed() {
        return 10;
    }
}

// getSpeed() method must be overridden - a conflict occurred
public class DefaultMethods implements Walk, Run {

    @Override
    public int getSpeed() {
        // a way to call a hidden default interface method
        return Walk.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new DefaultMethods().getSpeed());
    }
}
