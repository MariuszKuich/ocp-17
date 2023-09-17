package pl.mariuszk.chapter_2_operators;

public class Operators {

    public static void main(String[] args) {
        int a = 1;
        /*
        a++ is evaluated first. It sets the value of a to 2 and returns 1.
        ++a operations are evaluated from left to right.
        First ++a sets the value of a to 3 and returns 3.
        Second ++a sets the value of a to 4 and returns 4.
        The expression is: int b = 4 + 3 + 1;
        Therefore b = 8 and a = 4.
        Each unary operator updates the value of variable a. The updated value is used by other unary operators.
         */
        int b = ++a + ++a + a++;
        System.out.println("b value: " + b);
        System.out.println("a value: " + a);
    }
}
