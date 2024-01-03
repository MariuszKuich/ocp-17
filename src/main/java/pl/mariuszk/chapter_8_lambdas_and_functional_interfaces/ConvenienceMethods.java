package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethods {

    public static void main(String[] args) {
        Predicate<String> isApple = s -> s.contains("apple");
        Predicate<String> isRed = s -> s.contains("red");
        Predicate<String> isRedApple = isApple.and(isRed);
        Predicate<String> isNotRedApple = isApple.and(isRed.negate());

        Function<String, String> f1 = s -> s + "1";
        Function<String, String> f2 = s -> s + "2";
        // f1 is first applied, then f2 is applied to the result
        Function<String, String> functionAndThen = f1.andThen(f2);
        // f2 is first applied, then f1 is applied to the result
        Function<String, String> functionCompose = f1.compose(f2);
        System.out.println(functionAndThen.apply("Tom"));
        System.out.println(functionCompose.apply("Tom"));

        BooleanSupplier b = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return false;
            }
        };
    }
}
