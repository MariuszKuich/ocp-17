JDK contains minimum software needed for Java development:
* key commands / programs (javac, java, jar, javadoc),
* JVM,
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
The `javac` command - based on a source code - produces a bytecode saved in .class files. The bytecode is understandable by the JVM.

`String[] args` is the most common way to define the parameter for the `main` method. But you can choose different method\
name or use varargs instead of an array. So it can also be written as e.g. `String[] options`, `String options[]`, `String... friends`.

