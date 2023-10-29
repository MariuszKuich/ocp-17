Inheritance means a subclass automatically includes certain members (such as fields and methods) defined in the parent class.\
subclass = child class\
superclass = parent class\
Inheritance is transitive - if X extends Y and Y extends Z, then X is considered a subclass of Z.\
When one class inherits from other class, all public and protected members are automatically available in the child class.
If classes are in the same package then also package-private members are available to the child class.

Class modifiers

| Modifier   | Description                                                                             |
|------------|-----------------------------------------------------------------------------------------|
| final      | The class may not be extended.                                                          |
| abstract   | The class may contain abstract methods and requires a concrete subclass to instantiate. |
| sealed     | The class may only be extended by a specific list of classes.                           |
| not-sealed | A subclass of a sealed class permits potentially unnamed subclasses.                    |
| static     | Used for nested classes.                                                                |

Java supports single inheritance. All objects in Java inherit from `java.lang.Object` class.

In a .java file there can be **at most** one `public` top-level class. A file can contain many other classes 
with package-private access. Declaring a top-level class with `protected` or `private` access modifier will lead to compiler error.\
See `ClasAccessModifiers` class.

`this` keyword can be used to access any member of the class, including inherited members.\
A variable or a method can be defined in both a parent class and a child class. This means the object instance can hold
two copies of the same variable with the same underlying name.\
Parent values can be accessed using the `super` keyword.\
`this` includes current and inherited members, `super` only includes inherited members.\
Declaring a variable with the same name as an inherited variable is referred to as _hiding_ a variable.\
See `this_super.Beetle` class.

_Constructor overloading_ is defining multiple constructors with different signatures (same name, different parameter lists).
It is similar to _method overloading_.\
The compiler only inserts the default no-args constructor when no constructors are defined in the class.\
Private constructor is useful when a class has only static members or when the developer wants to control instantiating a class.

