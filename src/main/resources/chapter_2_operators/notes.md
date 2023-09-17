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