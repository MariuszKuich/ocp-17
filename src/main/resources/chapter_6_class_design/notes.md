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
