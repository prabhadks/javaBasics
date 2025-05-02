In Java, each primitive data type has a corresponding wrapper class that allows it to be treated as an object (reference type). These mappings are as follows:

byte → Byte

char → Character

short → Short

int → Integer

boolean → Boolean

long → Long

float → Float

double → Double

The main purpose of wrapper classes is to provide a way to use primitive data types as objects. Wrapper classes include several utility methods that allow operations on the values, such as conversions, parsing, and comparisons.

For example, to convert an int value to a float, or to store primitive values in Java collections (like ArrayList), you need to use wrapper classes. This is because collections in Java can only store objects, not primitive types. Wrapping a primitive into its corresponding wrapper class (a process known as boxing) allows it to be stored in a collection.

Each wrapper class in Java provides various conversion methods to convert its value to other primitive types. These are instance methods available in the wrapper classes like Integer, Double, Boolean, etc.

Examples of Integer class methods:
Integer num = 42;
num.byteValue();     // returns byte
num.shortValue();    // returns short
num.intValue();      // returns int
num.longValue();     // returns long
num.floatValue();    // returns float
num.doubleValue();   // returns double

Examples of Double class methods:
Double val = 42.5;
val.byteValue();     // returns byte
val.shortValue();    // returns short
val.intValue();      // returns int
val.longValue();     // returns long
val.floatValue();    // returns float
val.doubleValue();   // returns double

Examples of Boolean class methods:
Boolean flag = true;
flag.booleanValue(); // returns boolean
Note: Boolean does not have methods to convert to numeric types since it's logically true/false.


Examples of Character class methods:
Character ch = 'A';
char c = ch.charValue(); // returns char
Character is specific to char and doesn't offer numeric conversions.

Notes:	
	
Numeric wrapper classes (Byte, Short, Integer, Long, Float, Double) provide methods to convert to any numeric primitive type.	
	
Boolean and Character are non-numeric, so their conversion methods are limited to their own type.	
