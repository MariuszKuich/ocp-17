Top-level types can only be declared with `public` or package-private access modifier (see `TopLevelType` file).\
A Java file can have at most one `public` top-level type and its name must match the filename.

Interface - abstract data type that declares a list of abstract methods that any class implementing the interface must provide.
Although this definition is not precise nowadays since new method types are now supported by interfaces.\
See `InterfaceDefinition` file.

When implementing interface's method, `public` access modifier must be used, return type must be covariant and method signature
must match the method signature from the interface.\
If a class implements multiple interfaces, it is possible to override more than one abstract method at the same time with one 
method declaration.\
See `ImplementingInterface` file.

An interface can extend another interface using the `extends` keyword.\
An interface can extend multiple interfaces separated by comma after the `extends` keyword.\
When a concrete class inherits an interface, all of the inherited abstract methods must be implemented.