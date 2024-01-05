package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

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

        // Lambdas are allowed to reference some variables from the surrounding code - instance / class variables,
        // method parameters, local variables. Instance and class variables are always allowed. Method parameters
        // and local variables need to be final or effectively final.
        String name = "John";
        Supplier<String> cn =  () -> name;
        // The following line causes compiler error on line 35 - local variable 'name' is not effectively final anymore.
//        name = "Jon";
    }
}
