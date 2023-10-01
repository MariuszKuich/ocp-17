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
and returns a reference to the current SB instance