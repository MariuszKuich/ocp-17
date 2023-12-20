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

