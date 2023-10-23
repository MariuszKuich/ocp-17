Method signature = method name + types and order of parameters

Access modifier must be specified before the return type.\
Available access modifiers : 
* private - only accessible within a class, 
* package-private (default if no access modifier is specified) - `private` + other members of the same package, 
* protected - `package-privte` + subclasses, 
* public - `protected` + classes in other packages

Watch out for tricky scenarios with `protected` access modifier. See `chapter_5_methods.access_modifiers` package.

Access modifiers and optional specifiers can appear in any order but they must all appear before the return type.\
The following is valid: `final public void test()`.\
Optional specifiers:
* static,
* abstract - used in abstract classes and interfaces when method body is excluded,
* final - indicates that a method cannot be overridden in subclasses,
* default - used in interfaces to provide a default implementation,
* synchronized - used with multithreaded code

When returning a value, it needs to be assignable to the return type. So e.g. a method with return type `long` can have
a return statement `return 9;` (but not the other way round).

Method names follow the same rules as variable names.

A method can throw many exceptions. For example: `void twoExceptions() throws IllegalArgumentException, InterruptedException`.

The only modifier that can be applied to a local variable (a variable defined within a block or a method) is `final`.\
There's no need to assign a value when `final` variable is declared. The only rule is that it must be assigned a value
before it can be used.\
Contents of a `final`object can be freely modified.\
An _effectively final_ local variable is one that is not modified after it is assigned 
(its value does not change after it's set).\
An easy way to find out if a variable is effectively final is to add the `final` modifier to it. 
If the code still compiles - the variable is effectively final.\
Local classes and lambda expressions declared within a method can only reference variables that are final or effectively final.

Instance variables can use the following modifiers (apart from access modifiers):
* final - variable must be initialized with each instance of the class exactly once (value must be assigned
when the variable is declared or when the object is instantiated (instance initializers, constructors)),
* volatile - instructs the JVM that the value in this variable may be modified by other threads,
* transient - variable should not be serialized with the class

The compiler does not assign the default value (e.g. 0 for `int`) to `final` instance variables.

Creating methods with varargs (e.g. `String... args`):
* a method can have at most one varargs parameter,
* if a method contains a varargs parameter, it must be the last parameter in the list.

See `Varargs` class.

When the `static` keyword is applied to a variable / method / class, it belongs to the class rather than a specific
member of the class.\
Static methods have two main purposes: for utility or helper methods that don't require any object state and for state
that is shared by all instances of a class (like a counter).\
See `Static` class for a tricky example.\
Static variables (as well as instance variables) are automatically initialized to the default value for that type 
(e.g. 0 for int).\
In classes, static methods cannot call instance methods. Similarly, in interfaces a static methods cannot call default
methods.

constants = `static` + `final` variables\
Naming convention for constants: uppercase letters with underscores between words (regardless of access modifier).\
`static final` variables _must_ be initialized on variable declaration or inside a static initializer (see `Static` class).

Static initializers are run when the class is first loaded in the order they are defined.

Regular imports are for importing classes while static imports are for importing static members of classes like variables
and methods.\
Doing a static import of two methods with the same name or two variables with the same name gives a compiler error.\
Creating a method with the same name as statically imported method makes that Java gives it preference over the imported one
and the explicitly defined method is used.

Java is a "pass-by-value" language. See `PassingObjects` class.

Autoboxing is the process of converting a primitive into its equivalent wrapper class.\
Unboxing is the process of converting a wrapper class into its equivalent primitive.\
See `Autoboxing` class.