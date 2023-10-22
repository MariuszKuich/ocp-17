package pl.mariuszk.chapter_5_methods;

public class Static {

    private static final int LENGTH = 20;

    private static final int HEIGHT;

    static {
        HEIGHT = 1;
    }

    public static long hiss = 2;

    public static void main(String[] args) {
        Static staticInstance = new Static();
        System.out.println(staticInstance.hiss);
        staticInstance = null;
        // no NPE is thrown - the compiler checks for the type of the reference (which is static) and uses that instead of the object
        System.out.println(staticInstance.hiss);
    }
}
