Lambda expressions:\
A lambda expression is like an unnamed method existing inside an anonymous class.\
Lambdas are used with a concept called _deferred execution_, which means the code is specified now, but will run later.\
Lambdas work with interfaces that have exactly one abstract method.\
The parentheses around lambda parameters can be omitted if there is a single parameter and its type is not explicitly stated.\
Braces in the body part can be omitted if the body contains a single statement.\
`return` statement and a semicolon can be omitted when no braces are used.\
Examples of valid lambda expressions:\
`a -> a.canHop()`\
`(Animal a) -> { return a.canHop(); }`\
`a -> {}`\
`() -> true`\
`(x, y) -> x + y`\
`(String x, String y) -> x.contains(y)`
