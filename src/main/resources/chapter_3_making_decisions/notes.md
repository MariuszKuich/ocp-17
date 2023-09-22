Java 16 introduced pattern matching with `if` statements and the `instanceof` operator (see PatternMatching class).\
Flow scoping is applied when working with pattern matching. This means that the variable is only in scope when the compiler
can definitively determine its type.\
This is why the following does not compile: `if (number instanceof Integer data || data.compareTo(5) > 0) {}`\