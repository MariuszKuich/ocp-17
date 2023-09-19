Unless overridden with parenthesis, Java operators follow a specific order of operation:
![operators_precedence.jpg](imgs%2Foperators_precedence.jpg)
Operators with the same level of precedence are evaluated from left to right.\

~ operator can only be applied to integer numeric types such as byte, short, int, long.\
A simple rule: to find the bitwise complement of a number, multiply it by negative one and then subtract one.

Operators that take one operand = unary operators\
Operators that take two operands = binary operators\
Operators that take three operands = ternary operators

Increment and decrement operators:

| Operator       | Example | Description                                             |
|----------------|---------|---------------------------------------------------------|
| Pre-increment  | ++w     | Increases the value by 1 and returns the new value      |
| Pre-decrement  | --x     | Decreases the value by 1 and returns the new value      |
| Post-increment | y++     | Increases the value by 1 and returns the original value |
| Post-decrement | z--     | Decreases the value by 1 and returns the original value |

Arithmetic binary operators: +, -, *, /, %.\
When parentheses are added to an operation, values are evaluated starting from the innermost parentheses.

Java numeric promotion rules (see TypePromotion class):
* If two values have different data types, Java will automatically promote one of the values to the larger of the two data types,
* If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the
floating point's value data type,
* Smaller data types - byte, short, char - are first promoted to int any time they're used with a Java binary arithmetic operator
with a variable (as opposed to a value), even if neither of the operands is int,
* After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type 
as its promoted operands.

When assigning values to variables, Java will automatically promote from smaller to larger (or widening) data types.\
Converting from larger to smaller (or narrowing) data types requires casting (as a risk of precision loss is present).\
Casting - unary operation where one data type is explicitly interpreted as another data type.\
Casting a numeric value may change the data type, casting an object only changes the reference to the object, not the object itself.\

Compiler automatically detects if a literal value is too large to be assigned to a variable, e.g. `short a = 1921222`.\
It can be fixed with casting: `short a = (short)1921222`.

Compound assignment operators: +=, -=, *=, /=.\
An assignment operation does two things: it sets the value for a variable and returns the value of the assignment. For example:
`long wolf = 5; long coyote = (wolf = 3);` is valid and sets the value for both variables to 3.\
Equality operators: ==, !=.\
Relational operators: <, <=, >, >=, instanceof.

instanceof - returns true if the reference on the left side is an instance of the type on the right side (class, interface,
record, enum, annotation). It supports polymorphism.\
It is considered a good practice to use instanceof prior to casting from one object to a narrower type.\
Important note: if the compiler can determine that a variable cannot possibly be cast to a specific class, it reports and error
(see InstanceOf class).\
Calling instanceof on the null literal or a null reference always returns false.

Logical operators:
* & - value is true only if both values are true,
* | - value is true if at least one of the values is true,
* ^ - value is true only if one value is true and the other is false.

Logical operators can be applied to both numeric and boolean data types.\
When applied to boolean data types, they're referred to as logical operators.\
When applied to numeric data types, they're referred to a bitwise operators.