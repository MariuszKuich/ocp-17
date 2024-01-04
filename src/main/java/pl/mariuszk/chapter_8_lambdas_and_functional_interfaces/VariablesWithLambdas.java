package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class VariablesWithLambdas {

    public static void main(String[] args) {
        // Specifying the types of lambda's parameters is optional - lambdas infer types from the surrounding context.
        // var can be used instead of a specific type.
        // The following three statements are interchangeable:
        Consumer<String> c1 = x -> System.out.println(x);
        Consumer<String> c2 = (var x) -> System.out.println(x);
        Consumer<String> c3 = (String x) -> System.out.println(x);

        // All parameters of lambda expressions must use one of three formats: without types, with explicit types, with var.
        // Mixing the above formats in one lambda expression ends with an exception.
        // (var x, String y) -> System.out.println(x + y); - invalid

        // Modifiers can be added to lambda parameters.
        BiConsumer<String, String> bc2 = (final var x, @Deprecated var y) -> System.out.println(x + y);

        // Remember: a local variable cannot be created with the same name as one already used in the scope.
        // The following is not valid:
//        BiConsumer<String, String> c4 = (x, y) -> {
//            int x = 3;
//            System.out.println(x + y);
//        };
    }
}
