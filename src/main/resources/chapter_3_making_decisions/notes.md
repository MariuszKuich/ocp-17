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
Two types of branches can be used with the switch expression: an expression and a block (see SwitchExpression class).\
Java 17 supports pattern matching with switch expressions but it's a preview feature.\
`yield` keyword in switch expressions is used to avoid ambiguity about whether you want to exit the `case` block or 
the method around the `switch` expression.

While loop:\
Curly braces are required for blocks of multiple statements, optional for single statement.\
`while` loops are often used in places where you expect zero or more executions of the loop.

Do-while loop:\
Curly braces are required for blocks of multiple statements, optional for single statement.\
Do-while loop guarantees that the statement / block will be executed at least once.

For loop:\
Curly braces are required for blocks of multiple statements, optional for single statement.\
`for (initialization; booleanExpression; updateStatement)`\
The initialization and update sections may contain multiple statements, separated by commas.\
Each of the above sections is optional. Semicolons are always required.

Interesting variations of `for` loops:
* an infinite loop `for ( ; ; )`,
* multiple terms `for (long y = 0, z = 4; y < 10 && z < 15; y++, z++)`,
* redeclaring a variable in the initialization block `int x = 0; for (int x = 4; x < 5; x++) //DOES NOT COMPILE, 
CAN BE FIXED WITH for (x = 4; ...`,
* using incompatible data types `int x = 0; for (long y = 0, int z = 4; x < 5; x++) //DOES NOT COMPILE` - the variables
in the initialization block must all be of the same type.

For-each loop (enhanced for loop):\
`for (datatype instance: collection)`\
A collection must be a built-in Java array or an object whose type implements `java.lang.Iterable`.\
This means that not all of the Collection Framework classes can be used with the for-each loop. Only collections that 
extend or implement the `Collection` interface can be used (a `Map` is not one of such collections).

`if` statements, `switch` statements, blocks and loops can have labels assigned to them. A label is an optional pointer to the head
of the statement that allows the application to jump to it or break from it. For example: `LOOP: for(int i = 0; i < 5; i++)`.
(see `Labels` class).

Any code placed immediately after `break`, `continue` and `return` statement in the same block is considered unreachable 
and will not compile.

|          | Support labels | Support break | Support continue | Support yield |
|----------|----------------|---------------|------------------|---------------|
| while    | YES            | YES           | YES              | NO            |
| do/while | YES            | YES           | YES              | NO            |
| for      | YES            | YES           | YES              | NO            |
| switch   | YES            | YES           | NO               | YES           |

