Collection - a group of objects contained in a single object.\
Java Collections Framework - a group of classes for storing collections from the `java.util` package.\
`List`, `Queue` and `Set` interfaces extend the `Collection` interface. `Map` interface doesn't extend that interface.

Common methods from the Collections API: see `CommonCollectionsAPI` file.

`List` interface:\
List can be used when an ordered collection that allows duplicates is needed.\
Items can be inserted and retrieved at specific positions based on the `int` index.\
Many List implementations can change size after they are declared.\
All List implementations allow duplicates and are ordered collections, but beyond that, the offer different functionalities.

`List` implementations:\
`ArrayList` - it's like a resizable array. Any element can be looked up in constant time. Adding / removing an element is 
slower than accessing an element.\
`LinkedList` - implements both `List` and `Deque` (queue with access to both ends). It has methods for adding / removing 
elements from beginning / end of the collection. Adding / removing / accessing elements from beginning / end of a list
is done in constant time. Dealing with an arbitrary index is slower.

Factory method for creating a `List`:\
`Arrays.asList(varargs)` - returns a fixed list. Elements cannot be added or deleted, but they can be replaced.\
`List.of(varargs)` - returns an immutable list. Elements cannot be added, replaced or deleted.\
`List.copyOf(collection)` - returns an immutable list with a copy of original collection's values. 
Elements cannot be added, replaced or deleted.

See `Lists` file.