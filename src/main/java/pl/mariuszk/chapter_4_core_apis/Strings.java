package pl.mariuszk.chapter_4_core_apis;

public class Strings {

    public static void main(String[] args) {
        var name = "Kate";
        var orderId = 1;
        /*
        Formatting methods
        Common formatting symbols used with these methods:
        %s - applies to any type, commonly String values,
        %d - applies to integer values like int and long,
        %f - applies to floating-point values like float and double,
        %n - inserts a line break.
        Floating point values can be formatted:
        %12.8f - specifies total value length (12) and the number of digits past the decimal (8, the value is rounded).
        $012.8f - empty space (if total value length is less than 12) is filled with zeros instead of blank spaces.
         */
        String format = String.format("Hello %s order %d is ready", name, orderId);
        System.out.println(format);
        String format2 = "Hello %s order %d is ready".formatted(name, orderId);
        System.out.println(format2);
    }
}
