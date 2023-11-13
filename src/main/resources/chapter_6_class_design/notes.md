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
`null` can be assigned to `final` instance variables as long as they are explicitly set.\
`static final` fields must be assigned a value when they are declared or in static initializer.\
`final` fields must be assigned a value when they are declared, in instance initializer or in constructor.

The process of instance initialization:
* initialize the class if it wasn't initialized yet,
* if the class has a superclass, initialize the instance of the superclass first,
* process all instance variable declarations in the order in which they appear in the class,
* process all instance initializers in the order in which they appear in the class,
* initialize the constructor including any overloaded constructors referenced with `this()`

In Java, overriding a method is when  a subclass declares a new implementation for an inherited method with the same signature
and compatible return type.\
A parent version of the overridden method can still be referenced using the `super` keyword.\
Overriding methods is an example of polymorphism.

Rules for overriding a method:
* the method in the child class must have the same signature as the method in the parent class,
* the method in the child class must be at least as accessible as the method in the parent class,
* the method in the child class may not declare a checked exception that is new or broader than the class of any exception
declared in the parent class method (but an overridden method can declare any number of new unchecked exceptions),
* (for methods which return a value) the return type of the child class method must be the same or a subtype of the 
return type of the parent class method (_covariant return types_), for example `String` is a subtype of `CharSequence`

`@Override` annotation prevents from making mistakes when overriding methods (if the compiler doesn't see an inherited 
method that is being overridden, it reports an error).

Private methods from superclasses cannot be overridden (since they cannot be inherited) but they can be redeclared - 
a child class can define its own version of the method - the new method is not an overridden version of the parent class.\
For example: superclass can have `private String getSize()` method and child class can redeclare it as 
`private int getSize()` - these are separate methods.

`static` methods cannot be overridden, but they can be hidden.\
A hidden method occurs when a child class defines a static method with the same signature as a static method in the parent class.\
4 rules for overriding methods must be followed when a method is hidden.\
There's also an additional fifth rule: the child class method must be marked as `static` if it is marked as `static` in the parent class. 

Put simply:\
Two methods are marked as `static` = method hiding\
Two methods are not marked as `static` = method overriding\
One method is marked as `static` and the other is not = the code does not compile

Variables on the other hand cannot be overridden, but they can be hidden.\
A hidden variable occurs when a child class defines a variable with the same name as an inherited variable from the parent class.\
This creates two distinct variables existing independently. Which variable is used depends on the reference type.\
See `VariableHiding` class.

Overriding a method replaces the parent method on all reference variables.\
Hiding a method / variable replaces the member only if a child reference type is used.

`final` methods cannot be overridden or hidden, but if they are `private`, they can be redeclared.

Abstract class is a class that cannot be instantiated directly and can contain abstract methods.\
Abstract method is a method that does not define a body. Subclasses are forced to override such method.\
Overriding an abstract method follows the existing rules for overriding methods.\
Like `final` modifier, `abstract` modifier can be placed before or after the access modifier.

Marking a method or a class as both `final` and `abstract` ends with a compiler error.\
Marking a method as both `abstract` and `private` or `abstract` and `static` does not compile as well.

An abstract class can extend a concrete class and vice versa. Anytime a concrete class is extending an abstract class,
it must implement all of the methods that are inherited as abstract.

Constructors in abstract classes - see `Platypus` class.

An immutable object is one that cannot change state after it is created.\
Making a class immutable:
* mark the class as `final` or make all of the constructors `private`,
* mark all the instance variables `private` and `final`,
* don't define any setter methods,
* don't expose getter method for mutable instance fields e.g. for lists,
* set all properties of the object in the constructor, make copies of parameters if needed.

