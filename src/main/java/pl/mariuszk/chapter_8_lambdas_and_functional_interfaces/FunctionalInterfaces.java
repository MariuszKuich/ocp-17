package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

interface NotFunctional {
    String toString();
}

interface Functional {
    void test();
    String toString();
    boolean equals(Object o);
    int hashCode();
}
