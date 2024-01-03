Lambda expressions:\
A lambda expression is like an unnamed method existing inside an anonymous class.\
Lambdas are used with a concept called _deferred execution_, which means the code is specified now, but will run later.\
Lambdas work with interfaces that have exactly one abstract method.\
The parentheses around lambda parameters can be omitted if there is a single parameter and its type is not explicitly stated.\
Braces in the body part can be omitted if the body contains a single statement.\
`return` statement and a semicolon can be omitted when no braces are used.

Examples of valid lambda expressions:\
`a -> a.canHop()`\
`(Animal a) -> { return a.canHop(); }`\
`a -> {}`\
`() -> true`\
`(x, y) -> x + y`\
`(String x, String y) -> x.contains(y)`

A functional interface is an interface that contains a single abstract method.\
`@FunctionalInterface` annotation tells the compiler that an interface is intended to be a functional interface.
If it does not follow the rules for functional interfaces, a compiler error is raised.\
If a functional interface includes an abstract method with the same signature as `public` method from the `Object` class,
**those methods do not count toward the single abstract method test** (`public String toString()`, 
`public boolean equals(Object)`, `public int hashCode()`).\
See `FunctionalInterfaces` file.

A method reference can be used when a lambda expression is used only for passing a parameter to another method (but
a method reference doesn't have to take any parameters).\
An example: `s -> System.out.println(s)` = `System.out::println`

There are four formats of method references:
* `static` methods (e.g. `Math::round` - `round` is a static method),
* instance methods on a particular object (e.g. `str::startsWith`, `str::isEmpty`),
* instance methods on a parameter that will be supplied at runtime (e.g. `String::isEmpty` - `isEmpty` is an instance method),
* constructors (e.g. `String::new`)

See `MethodReferences` file.

Built-in functional interfaces:\
Below table contains basic built-in functional interfaces from the `java.util.function` package.

| Functional interface | Return type | Method name | # of parameters |
|----------------------|-------------|-------------|-----------------|
| Supplier <T>         | T           | get()       | 0               |
| Consumer<T>          | void        | accept(T)   | 1               |
| BiConsumer<T,U>      | void        | accept(T,U) | 2               |
| Predicate<T>         | boolean     | test(T)     | 1               |
| BiPredicate<T,U>     | boolean     | test(T,U)   | 2               |
| Function<T,R>        | R           | apply(T)    | 1               |
| BiFunction<T,U,R>    | R           | apply(T,U)  | 2               |
| UnaryOperator<T>     | T           | apply(T)    | 1               |
| BinaryOperator<T>    | T           | apply(T,T)  | 2               |

See `BuiltInFunctionalInterfaces` file.

Some helpful convenience (default) methods available on basic built-in functional interfaces:

| Interface instance | Method return type | Method name | Method parameters |
|--------------------|--------------------|-------------|-------------------|
| Consumer           | Consumer           | andThen()   | Consumer          |
| Function           | Function           | andThen()   | Function          |
| Function           | Function           | compose()   | Function          |
| Predicate          | Predicate          | and()       | Predicate         |
| Predicate          | Predicate          | negate()    | -                 |
| Predicate          | Predicate          | or()        | Predicate         |

See `ConvenienceMethods` file.

Functional interfaces for primitives:

| FunctionalInterface | Return type | Single abstract method | Number of parameters |
|---------------------|-------------|------------------------|----------------------|
| BooleanSupplier     | boolean     | getAsBoolean           | 0                    |
| DoubleSupplier      | double      | getAsDouble            | 0                    |
| IntSupplier         | int         | getAsInt               | 0                    |
| LongSupplier        | long        | getAsLong              | 0                    |
| DoubleConsumer      | void        | accept                 | 1 (double)           |
| IntConsumer         | void        | accept                 | 1 (int)              |
| LongConsumer        | void        | accept                 | 1 (long)             |
| DoublePredicate     | boolean     | test                   | 1 (double)           |
| IntPredicate        | boolean     | test                   | 1 (int)              |
| LongPredicate       | boolean     | test                   | 1 (long)             |
| DoubleFunction<R>   | R           | apply                  | 1 (double)           |
| IntFunction<R>      | R           | apply                  | 1 (int)              |
| LongFunction<R>     | R           | apply                  | 1 (long)             |