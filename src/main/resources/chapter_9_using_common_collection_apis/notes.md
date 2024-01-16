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

`List` interface contains methods for:
* adding a new element - `add(element)`
* adding a new element at index - `add(index, element)`
* retrieving an element at index - `get(index)`
* removing an element at index - `remove(index)`
* replacing every element in a list with a result of an operator - `replaceAll(unaryOperator)`
* replacing an element at index - `set(index, element)`
* sorting using comparator - `sort(comparator)`

See `Lists` file.

`Set`:\
All `Set` implementations do not allow duplicates.\
`HashSet` stores its elements in a _hash table_ - keys are a hash (`hashCode()` method is used), values are an `Object`.\
In `HashSet` adding elements and checking whether an element is in the set have constant time, but elements are unordered.\
`TreeSet` stores elements in sorted tree structure. Elements are ordered but adding elements and checking whether an element
exists take longer than in `HashSet`.

See `Sets` file.

`Queue` and `Deque` interfaces:\
`Queue` = FIFO - first-in, first-out\
`Deque` (double-ended queue) = elements can be inserted / removed from both the front and the back; it implements `Queue`\
`LinkedList` implements `List` and `Deque` (which means it also implements `Queue`).

`Queue` methods (first methods throw exception if something goes wrong): 
* adding to back: `add(E)`, `offer(E)`
* reading from front: `element()`, `peek()`
* reading and removing element from front: `remove()`, `poll()`

`Deque` methods (first methods throw exception if something goes wrong):
* adding to front: `addFirst(E)`, `offerFirst(E)`
* adding to back: `addLast(E)`, `offerLast(E)`
* reading from front: `getFirst()`, `peekFirst()`
* reading from back: `getLast()`, `peekLast()`
* reading and removing from front: `removeFirst()`, `pollFirst()`
* reading and removing from back: `removeLast()`, `pollLast()`

`Dequeue` can also be used as a stack (LIFO - last-in, first-out) with these methods (first two methods throw exceptions
if something goes wrong):
* adding to top: `push(E)`
* removing from top: `pop()`
* getting first element without removing it: `peek()`

