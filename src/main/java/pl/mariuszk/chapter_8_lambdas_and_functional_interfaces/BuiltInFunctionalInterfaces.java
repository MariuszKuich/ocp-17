package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {
        // Supplier is used for generating / supplying values without taking any input
        Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
        System.out.println(dateSupplier.get());

        // Consumer is used when you want to do something with the parameter but not return anything
        // BiConsumer does the same thing but it accepts two parameters

    }
}

