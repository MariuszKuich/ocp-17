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

