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
* removing from top: `pop()`+
* getting first element without removing it: `peek()`

`Map`:\
`TreeMap` is sorted, `HashMap` is not.\
`HashMap` stores the keys in a hash table. Adding and retrieving elements by key both have constant time. 
Elements lose the insertion order. It can be fixed with `LinkedHashMap`.\
`TreeMap` stores keys in a sorted tree structure. Keys are always in sorted order (e.g. alphabetically for strings). 
Adding and retrieving elements by key takes longer as the tree grows.

Basic `Map` methods:
* removes all keys and values: `clear()`
* returns whether map contains key: `containsKey(Object key)`
* returns whether map contains value: `containsValue(Object value)`
* returns set of key/value pairs: `entrySet()`
* loops through key/value pairs and applies biConsumer to them: `forEach(BiConsumer<K,V> biConsumer)`
* returns value for key or null if not found: `get(Object key)`
* returns value for key or default value: `getOrDefault(Object key, V defaultValue)`
* returns whether map is empty: `isEmpty()`
* returns set of keys: `keySet()`
* sets value if key is not set (missing or null); runs function if key is set to determine new value (existing value 
and new value are passed to the function) - removes entry if computed value is null: 
`merge(K key, V value, BiFunction<V, V, V> func)`
* adds/replaces key/value pair; returns previous value or null: `put(K key, V value)`
* adds value if key is not set; returns existing value if key is set: `putIfAbsent(K key, V value)`
* removes and returns value mapped to key: `remove(Object key)`
* replaces value for key if it is set and returns original value: `replace(K key, V value)`
* replaces each value with results of function: `replaceAll(BiFunction<K, V, V> func)`
* returns number of entries in map: `size()`
* returns Collection of values: `values()`

See `Maps` file.

Sorting data:\
For numbers, order is a numerical order.\
For String objects, order is defined by Unicode character mapping (numbers come before letters, uppercase letters
come before the lowercase letters).\
For custom objects there is a `Comparable` interface.\
There's also a `Comparator` class that allows to specify a different order than the object itself provides.

See `ComparableExample` file.

`compareTo()` and `equals()` method should be consistent - `x.equals(y)` is true whenever `x.compareTo(y)` equals 0 .

`Comparator` is helpful when sorting objects that do not implement `Comparable` or when objects need to be sorted 
in different ways at different times.\
See `ComparatorExample` file.\
`Comparable` is in `java.lang` package, while `Comparator` in `java.util` package. This means that `Comparator` 
needs to imported before use.
