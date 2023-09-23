Java 16 introduced pattern matching with `if` statements and the `instanceof` operator (see PatternMatching class).\
Flow scoping is applied when working with pattern matching. This means that the variable is only in scope when the compiler
can definitively determine its type.\
This is why the following does not compile: `if (number instanceof Integer data || data.compareTo(5) > 0) {}`

Switch statement: beginning and ending curly braces are required, `switch` statement without any `case` statements is
perfectly valid , `case` values can be combined into a single `case` statement using commas (since Java 14), e.g. 
`case contrantExpression1, constantExpression2:`.

Switch statements support the following data types:
* int, Integer,
* byte, Byte,
* short, Short,
* char, Character,
* String,
* enum values,
* var if the type resolves to one of the preceding types.

Rules for values or variables used in `case` statements:
* the value must be a compile-time constant value of the same data type as the `switch` value,
* only literals, enum constants and `final` constant variables initialized with a literal value can be used 
(meaning this can be used in a `case` statement: `final a = 3;` and this cannot: `final a = getA();`),
* `case` statement that requires executing a method at runtime is illegal, for example: the following is illegal 
`case getCookies():` and the following is legal `case 3 * 5:`.

Since Java 14 switch expressions can be used. They are more compact form of switch statements and can return a value.
Two types of branches can be used with the switch expression: an expression and a block (see SwitchExpression class).