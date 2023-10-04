Strings:\
If both operands are numeric, + means numeric addiction. If either operand is a String, + means concatenation.
The expression is evaluated left to right. Examples:\
1 + 2 + "c" = "3c"\
"c" + 1 + 2 = "c12"\
"c" + null = "cnull"

Important String methods:
* `length()`,
* `charAt(int index)`,
* `indexOf(int ch)`, `indexOf(int ch, int fromIndex)`, `indexOf(String str)`, `indexOf(String str, int fromIndex)` - 
It finds the first index that matches the desired value. It returns -1 if no match is found. 
A `char` can be passed to an `int` parameter type,
* `substring(int beginIdx)`, `substring(int beginIdx, int endIdx)` - `endIdx` is optional and exclusive. Examples:
`substring(3, 3)` returns an empty String, `substring(3, 2)` throws an Exception, 
`substring(1, str.length() + 1)` throws an Exception,
* `toUpperCase()`,
* `toLowerCase()`,
* `equals(Object)`,
* `equalsIgnoreCase(String)`,
* `startsWith(String)`,
* `endsWith(String)`,
* `contains(CharSequence)`,
* `replace(char, char)`, `replace(CharSequence, CharSequence)`,
* `strip()`, `trim()` for removing whitespaces, `strip` supports Unicode,
* `stripLeading()` for removing whitespaces from the beginning of a String,
* `stripTrailing()` for removing whitespaces from the end of a String,
* `indent(int)` - if argument > 0 - it adds n spaces to the beginning of each line. If argument < 0 - it removes up to n spaces
from each line. If argument == 0 - there's no change. It also normalizes exiting line breaks (\r\n -> n) and adds a line break 
at the end of the String if it's missing,
* `stripIndent()` - it removes all leading incidental whitespace. It also normalizes exiting line breaks,
* `translateEscapes()` - `System.out.println("1\\t2".translateEscapes())` outputs `1    2`,
* `isEmpty()`,
* `isBlank()` - checks if a String contains only whitespace characters,
* formatting methods (see `Strings` class).

StringBuilder creates a String without storing any interim String values in memory. Unlike the String class, StringBuilder
is not immutable.\
Three ways to construct a StringBuilder:\
`new StringBuilder()` - SB containing an empty sequence of characters\
`new StringBuilder("animal")` - SB containing a specific value\
`new StringBuilder(10)` - SB should reserve a certain capacity, or number of slots, for characters

Important StringBuilder methods:
* `substring`, `indexOf`, `length`, `charAt` - these methods work exactly the same as in the String class,
* `append(String/int/char/...)` - it adds the parameter to the StringBuilder and returns a reference to the current SB instance,
* `insert(int offset, String str)` - it adds characters to the StringBuilder at the requested index and returns a reference 
to the current SB instance; it has lots of method signatures for different data types,
* `delete(int startIdx, int endIdx)`, `deleteCharAt(int idx)` -  it removes characters from the sequence 
and returns a reference to the current SB instance (endIdx value can be greater than the String length),
* `replace(int startIdx, int endIdx, String newString)` - endIdx is exclusive; Java deletes characters starting at startIdx
and ending right before the endIdx and inserts the newString value in that position (endIdx value can be greater than the String length),
* `reverse()`,
* `toString()` - converts StringBuilder object to a String object.

StringBuilder doesn't override the equals() method - calling equals() on two StringBuilder objects will check 
reference equality (using ==).

Check the `StringPool` class.

Arrays:\
Most common way of creating an array: `int[] numbers = new int[3]`. All elements are set to the default value for the
specified type.\
Another way of creating an array: `int[] numbers = new int[] {21, 88, 37}`.\
A shortcut (anonymous array): `int[] numbers = {21, 88, 37}`.\
Brackets `[]` can be placed before or after the variable name, optionally with additional space. All of the following is valid:\
`int[] numbers`\
`int [] numbers`\
`int []numbers`\
`int numbers[]`\
`int numbers []`\
Multiple arrays in declarations:\
`int[] ids, types` - this creates two variables of type `int[]`.\
`int ids[], types` - this creates one variable of type `int[]` and one of type `int`.

`equals()` method used on arrays checks the reference equality, it does not look at the elements of the array.\
Nice array printing: `Arrays.toString(arr)`.\
Arrays do not allocate space for objects, they allocate space for references to objects.\
Casting arrays: `String[] strArr = (String[]) new Object[] {"a", "b"}`.

Sorting arrays: `Arrays.sort(arr)`.

Searching elements: `Arrays.binarySearch(arr, searchedElement)`. An array need to be sorted for a binary search.\
A binary search splits the array into two equal peaces and determines which half the target is in. It repeats this process
until only one element is left.

Binary search rules:

| Scenario                                 | Result                                                                                                                         |
|------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| Target element found in sorted array     | Index of match                                                                                                                 |
| Target element not found in sorted array | Negative value showing one smaller than the negative of the index, where a match needs to be inserted to preserve sorted order |
| Unsorted array                           | This result is undefined (output is unpredictable, random)                                                                     |

When using `compare()`:\
A negative number means the first array is smaller than the second.\
A zero means the arrays are equal.\
A positive number means the first array is bigger than the second.

