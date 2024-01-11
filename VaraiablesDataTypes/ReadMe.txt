1. Variable is a container in computer memory, to store the data.
2. To access specific data from memory, should be able to identify those containers uniquely. Hence variable names are used.

Rules when creating variable names:
- lower camel case.
- cannot start with numbers or special characters.
- should not be any spaces in variable names.
- case-sensitive.
- cannot use reserved keywords as variable names

3. To know which type of data can be stored in specific variable, variable should be defined with a data type that tells the computer about the size of information to be stored.
4. Data in computer is stored in binary format. Amount of bits allocated to variable tells what range of data can be stored in it. Depending on the data range and kind of data stored there are different data types available in Java.
- On a high level, data types can be either Primitive or Non Primitive 

Primitive datatypes: Hold the actual value
Integers:
- byte: equal to 8 bits. Can store values from -128 to 127.
- short: equal to two bytes. Stores whole numbers from -32,768 to 32,767
- int: equal to four bytes. Stores whole numbers from -2,147,483,648 to 2,147,483,647
- long. equal to eight bytes. Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

Floating Point numbers:
- float:  store numbers with 7 digits after the decimal.
- double:  store numbers with 16 digits after the decimal.
Note: Float number should always be appended with "f", to ensure that it is not interpreted as double.

Characters:
- char

Booleans:
- boolean: store true or false which is binary format 1 or 0.

Primitive wrapper classes is a wrapper that encapsulates primitive data types, so that these can be used to create objects

Autoboxing and Unboxing: Compiler automatically converts between primitive and wrapper classes without need of explicit cast operators.
Autoboxing: Compiler automatically converts the primitive data type to corresponding Object Wrapper class. converting int to Integer, double to Double.
Ex: Integer i = 4;

Unboxing: Explicitly converting the Object of wrapper type to specific primitive data type
Integer i = new Integer(70);
int a = i;

Non Primitive datatypes: Hold the address of the objects they refer to.
- Classes
- Interfaces
- Annotations
- Enumerations
- Arrays

