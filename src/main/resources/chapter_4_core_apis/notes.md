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
* `equals()`,
* `equalsIgnoreCase()`