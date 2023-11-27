package pl.mariuszk.chapter_7_beyond_classes;


sealed class SealedClass permits FinalSubclass, NonSealedSubclass, SealedSubclass {

}

final class FinalSubclass extends SealedClass {

}

// non-sealed indicates that a class can be extended by unspecified classes
non-sealed class NonSealedSubclass extends SealedClass {

}

sealed class SealedSubclass extends SealedClass permits OtherSubclass {

}

final class OtherSubclass extends SealedSubclass {

}

// pay attention to the name of the subclass after the `permits` keyword
sealed class ClassWithNestedClass permits ClassWithNestedClass.NestedClass {
    final class NestedClass extends ClassWithNestedClass {

    }
}