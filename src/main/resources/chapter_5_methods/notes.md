Method signature = method name + parameter list

Access modifier must be specified before the return type.\
Available access modifiers : 
* private, 
* protected (subclass + same package), 
* public, 
* package-private (default if no access modifier is specified)

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