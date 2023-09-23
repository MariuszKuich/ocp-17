package pl.mariuszk.chapter_3_making_decisions;

public class PatternMatching {

    // Without pattern matching.
    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    // Pattern matching automatically applies casting to a variable.
    // The variable 'data' is referred to as pattern variable.
    // The variable 'data' can be reassigned, but it is considered a bad practice.
    // To prevent reassigning, use 'number instanceof final Integer data'.
    void compareIntegersPatterMatching(Number number) {
        if (number instanceof Integer data) {
            System.out.println(data.compareTo(5));
        }
    }

    // Pattern variables can be used together with filtering expressions
    // to execute the if statement only in specific circumstances.
    void compareIntegersPatterMatchingWithExpression(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.println(data);
        }
    }

    //An example of flow scoping - the compiler can definitively determine the 'data' variable type
    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }

    /*
    The type of the pattern variable must be a subtype of the variable on the left side of the expression.
    It cannot be of the same type. This rule does not exist for traditional 'instanceof' operator.
    Integer value = 123;
    if (value instanceof Integer) {} COMPILES
    if (value instanceof Integer data) {} DOES NOT COMPILE
     */
}
