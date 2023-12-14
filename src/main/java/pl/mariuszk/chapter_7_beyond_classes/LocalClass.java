package pl.mariuszk.chapter_7_beyond_classes;

public class LocalClass {

    private int length = 10;

    int calculate() {
        final int width = 20;
        class Calculator {
            int multiply() {
                return length * width;
            }
        }
        return new Calculator().multiply();
    }

    public static void main(String[] args) {
        var example = new LocalClass();
        System.out.println(example.calculate());
    }
}
