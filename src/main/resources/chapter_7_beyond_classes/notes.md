Top-level types can only be declared with `public` or package-private access modifier (see `TopLevelType` file).\
A Java file can have at most one `public` top-level type and its name must match the filename.

Interface - abstract data type that declares a list of abstract methods that any class implementing the interface must provide.
Although this definition is not precise nowadays since new method types are now supported by interfaces.\
See `InterfaceDefinition` file.

When implementing interface's method, `public` access modifier must be used, return type must be covariant and method signature
must match the method signature from the interface.\
If a class implements multiple interfaces, it is possible to override more than one abstract method at the same time with one 
method declaration. Methods must be compatible meaning a method that properly overrides both inherited methods can be written.\
See `ImplementingInterface` file.

An interface can extend another interface using the `extends` keyword.\
An interface can extend multiple interfaces separated by comma after the `extends` keyword.\
When a concrete class inherits an interface, all of the inherited abstract methods must be implemented.

Interface member types:

|                       | Membership | Required modifiers | Implicit modifiers  | Has value or body? |
|-----------------------|------------|--------------------|---------------------|--------------------|
| constant variable     | Class      | -                  | public static final | Yes                |
| abstract method       | Instance   | -                  | public abstract     | No                 |
| default method        | Instance   | default            | public              | Yes                |
| static method         | Class      | static             | public              | Yes                |
| private method        | Instance   | private            | -                   | Yes                |
| private static method | Class      | private static     | -                   | Yes                |

_class_ membership means a member is shared along all instances of the interface.\
_instance_ membership means a member is associated with a particular instance of the interface.

Default interface method _may optionally_ be overridden by a class implementing the interface.\
Default method cannot be marked as `abstract`, `static` or `final`.\
If a class inherits two or more `defaut` methods with the same signature, then the class must override the method.\
See `DefaultMethods` file.

Static interface method cannot be marked as `abstract` or `final`.\
Static interface method cannot be accessed in a class implementing the interface without the reference to the interface name.
It can also be accesses in classes that do not implement the interface (referencing the interface name).

Private methods were added to interfaces primarily to reduce code duplication.\
`default` and `private` non-static interface methods can access `abstract` methods defined in the interface.

An _enumeration_ (or _enum_ for short) is a fix set of constants.\
See `EnumExample` class.