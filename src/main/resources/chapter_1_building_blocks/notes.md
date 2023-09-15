JDK contains minimum software needed for Java development:
* key commands / programs (javac, java, jar, javadoc),
* JVM,
* compiler,
* core libraries (e.g. Collections API).

Fields and methods are called the *members* of the class.\
Method signature = method name + parameter types.\
For example: the `public int numberVisitors(int month) { return 10 }` method's signature is `numberVisitors(int)`.

Javadoc comment starts with `/**` and ends with `*/`.\
Everything between `/*` and `*/` is part of a multiline comment - even if it's a single-line comment.\
Everything after `//` is part of a single-line comment - event if it's a multiline comment written in a single line.\
However nesting a multiline comment inside another multiline comment is not possible (the code will not compile).\
This is because a multiline comment starts with first `/*` and ends with first `*/`.\
The compiler sees nested multiline comments as e.g. `/* /* */` which is not allowed - there's an extra `*/`.

In a source file *at most one* top-level type is allowed to be public and it's name needs to match the filename.\
For example: a file containing `public class Animal` and `class Animal2` must be called Animal.java.

To compile a Java program use the `javac ClassName.java` command. To run a Java program, use the `java ClassName` command.\
Shortcut for compiling single-file Java programs: `java ClassName.java`\
To pass some arguments to the program, use the `java ClassName Param1 Param2 "Third Param"` command.\
The `javac` command - based on a source code - produces a bytecode saved in .class files. The bytecode is understandable by the JVM.

`String[] args` is the most common way to define the parameter for the `main` method. But you can choose different method\
name or use varargs instead of an array. So it can also be written as e.g. `String[] options`, `String options[]`, `String... friends`.

If a package name starts with 'java' then this package came bundled with the JDK.\
Every class from the `java.lang` package is automatically imported. There's no need for importing classes from this package.\
Classes from the same package also don't have to be imported.\
A class imported explicitly takes precedence over any wildcards present. For example for a Date class:
* `import java.util.*; import java.sql.*;` - wrong, class name found in multiple packages,
* `import java.util.Date; import java.sql.Date;` - wrong, ambiguous class name,
* `import java.util.Date; import java.sql.*;` - correct, Date class from the java.util package will be used.

Compiling classes from the `pl.mariuszk.chapter_1_building_blocks.packages` package:\
`javac pl/mariuszk/chapter_1_building_blocks/packages/packagea/*.java pl/mariuszk/chapter_1_building_blocks/packages/packageb/*.java`\
Running the program compiled above: `java pl/mariuszk/chapter_1_building_blocks/packages/packageb/ClassB`

Options available to use with `java` and `javac`:
![java_javac_options.jpg](imgs%2Fjava_javac_options.jpg)
You can specify multiple class path resources separated with ';' on Windows or ':' on macOS/Linux.\
For example: `-cp ".;C:\temp\location;C:\temp\jar\myJar.jar"`

Options available to use with `jar`:
![jar_options.jpg](imgs%2Fjar_options.jpg)
Creating a jar file: `jar -cvf myJar.jar .`, `jar --create --verbose --file myJar.jar .`

The order of initialization in a class:
* Fields and instance initializers are run in the order in which they appear in the file,
* The constructor runs after all fields and instance initializer blocks have run.

Java has eight built-in data types (primitive types):
![primitive_types.jpg](imgs%2Fprimitive_types.jpg)
Bit size of boolean data type is not specified and depends on the JVM where the code is being executed.

For numeric literals I can use different formats:
* decimal - standard,
* octal - 0 prefix,
* hexadecimal - 0x or 0X prefix,
* binary - 0b or 0B prefix.

I can use underscores with numeric literals to make them easier to read, e.g. 1_000_000. Underscores can't be added at the\
beginning of a literal, the end of a literal, right before/after a decimal point. Multiple underscores can be placed next to each other.

Remember: primitive types will give you a compiler error if you attempt to assign null to them.

Wrapper classes for primitive types:

| Primitive type | Wrapper class | Wrapper class inherits Number? |
|----------------|---------------|--------------------------------|
| boolean        | Boolean       | No                             |
| byte           | Byte          | Yes                            |
| short          | Short         | Yes                            |
| int            | Integer       | Yes                            |
| long           | Long          | Yes                            |
| float          | Float         | Yes                            |
| double         | Double        | Yes                            |
| char           | Character     | No                             |

Each wrapper class offers a `valueOf(primitiveType)` method to convert primitive type to an object.\
There is also a `valueOf(String)` variant that converts String into the wrapper class instance, e.g. `Integer.valueOf("123")`.\
Except `Character`, every wrapper class offers a `parse*(String)` method that converts String into a corresponding 
primitive type, .e.g. `Double.parseDouble("123.33")`.

Text blocks:\
Also known as multiline strings.\
See `TextBlocks` class.

Rules for legal identifiers (e.g. variables names):
* identifiers must begin with a letter, a currency symbol or an underscore,
* identifiers can include numbers but not start with them,
* identifiers can consist only of letters, digits, currency symbols and underscores,
* a single underscore is not a valid identifier,
* you cannot use Java reserved words.

Local variables are variables defined in constructors, methods, initializer blocks.\
`final` keyword can be applied to both local variables and local variable references like so:\
`final int = 10;`\
`final int[] arr = new int[10];`\
The value of local variables cannot be modified.\
The value of the reference of local variable references also cannot be modified.\
For example: `arr = null;` is illegal, but `arr[0] = 3;` is perfectly legal.\
Local variables do not have a default value and must be initialized before use.\
On the other hand, instance and class variables are provided with default values if they're not initialized. The default value
is null for objects, zero for numeric types, false for boolean, '\u0000' for char (see table 1.6).

`var` (local variable type inference) can be used instead of the type when declaring local variables.\
Key information about var:
* it can only be used with local variables,
* underneath it is a specific type defined at compile time, it does not change at runtime,
* value for var needs to be assigned during declaration, this is not legal: `var a; a = 1;`,
* null for var is not allowed,
* it cannot be used in multiple variable declarations, like: `var a = 1, b = 3;`,
* it cannot be used with method/constructor parameters,
* var is not a reserved word - it is allowed to use it as an identifier. It cannot be used to name a class, an interface or an enum.
However, it can be used as a package name,a  method name, a local variable name. Also, Java is case-sensitive, so 
`Var` class name is perfectly legal.

Scope is a portion of code where a variable can be accessed.\
Local variables are valid only in the scope of a block they're defined in (starting from the line they're defined at). 
They can also be accessed from inner blocks.\
Instance variables are available as soon as they are defined and last for the entire lifetime of an object 
(until an object is eligible for garbage collection).\
Class variables are available from the moment of their declaration and stay in the scope for the entire life of a program.

Garbage collection is a process of automatically freeing memory on the heap by deleting objects that are no longer reachable in a program.\
Garbage collector is one of the processes running inside JVM.\
`System.gc()` - suggestion of running a garbage collector\
An object is not reachable if it no longer has any references pointing to it or all references to the objects have gone out of scope.\
Objects do not have names. References to objects have names.

