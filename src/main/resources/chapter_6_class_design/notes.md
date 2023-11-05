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

When `this()` with parentheses is used, Java calls another constructor on the same instance of the class.\
`this()` call must be the first statement in the constructor. Therefore, there can be only one call to `this()` in any 
constructor (comments are allowed since they are not statements).\
Java does not allow cyclic constructor calls - a constructor cannot call itself with `this(...)`.

The fist statement of _every_ constructor is a call to a parent constructor using `super()` or another constructor in the 
class using `this()`.\
Java compiler automatically inserts a call to the no-argument constructor `super()` if there's no explicit call to `this()`
or `super()` as the first line of a constructor.\
See `Donkey` class.\
`super()` can only be used as the first statement of the constructor.\
`super()` always refers to the most direct parent.

JVM decides when the class is loaded (or initialized): it may be initialized when the program starts, when a static member 
of the class is referenced or shortly before an instance of the class is created.\
Initialization happens _at most once_ for each class.

The process of class initialization:
* superclasses are initialized first (starting with the highest superclass and working downward),
* all `static` variable declarations are processed in order in which they appear in the class,
* all `static` initializers are processed in order in which they appear in the class.

`final` fields are not initialized with the default value by the compiler.\
By the time the constructor completes, all `final` instance variables must be assigned a value exactly once. This is different
from `final` local variables which must be assigned a value only if they are used.\
`null` can be assigned to `final` instance variables as long as they are explicitly set.

