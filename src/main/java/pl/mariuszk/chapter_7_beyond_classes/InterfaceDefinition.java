package pl.mariuszk.chapter_7_beyond_classes;

// implicit modifiers - modifiers inserted automatically by the compiler
// `abstract` is an implicit modifier
public abstract interface InterfaceDefinition {

    // `public` and `abstract` are implicit modifiers for methods
    // instance methods with body and static methods can also be `private`
    public abstract void method();

    // `public`, `static` and `final` are implicit modifiers for fields (making them constants)
    public static final int CONST = 10;
}
