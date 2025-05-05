Operators are symbols that perform operations on Operands.
When operations are done on two operands, then Operators are called as Binary operators.
When done on three operands, then termed as Trinary Operators

Main operators categories in java:
1. Arithmetic Operators - Operations performed on numerical values or variables.
- Addition (+) - Adds two numbers
- Subtraction (-) - Subtract right operand from left
- Multiplication (*) - Multiplies two numbers
- Division (/) - Divides the left operand by right
- Modulo, remainder (%) - Remainder of the division of left operand by right

2. Relational Operators
Output of relational operators is either true or false
Also, called as Comparision Operators
Comparision between two values or expressions
- Equal to (==) - Returns true if two values are equal
- Not equal to (!=) - Returns true if two values are not equal
- Greater than (>) - Returns true if left operand is greater than right
- Less than (<) - Returns true if left operand is less than right
- Greater than or equal to (>=) - Returns true if left operand is greater than or equal to right
- Less than or equal to (<=)- Returns true if right operand is greater or less than left

3. Logical Operators
Logical operations on boolean values 
Output is either true or false
- AND (&&) - Returns true if both operands are true
- OR (||) - Returns true if any of the operands is true
- NOT (!=) - Returns true if operand is false or vice versa

4. Assignment Operators: Used to assign value to variable
Also, there are operators combined with assignment in which Operation is performed and then value is assigned
- Assignment (=) [x = 3; 3 is assigned to x]
- Add and Assign(+=) [x +=3; Equal to x = x+ 3]
- Subtract and Assign(-=) [x -=3; Equal to x = x - 3]
- Multiply and Assign(*=) [x *=3; Equal to x = x * 3]
- Divide and Assign(/=) [x /=3; Equal to x = x / 3]
- Modulo and Assign(%=) [x %=3; Equal to x = x % 3]

5. Bitwise Operators:
Operation performed on bit level 
- bitwise AND (&) [AND operation done on corresponding bits of two integers. If both bits are 1, the result is 1; else it is 0.]
- bitwise OR (|) [OR operation done on corresponding bits of two integers. If either bit is 1, the result is 1]
- bitwise NOT (~) [Inverse of all the bits. That means if bit is 1 it would be 0
- bitwise XOR (^) [XOR operation done on corresponding bits of two integers. If both bits are same, the result is 0, else 1]
- left shift (<<)[Shifts the bits of an integer to the left by specified number of positions. And then append zeros on right]
- right shift (>>) [Shifts the bits of an integer to the right by a specified number of positions. The leftmost bits are filled with the sign bit (0 for positive numbers, 1 for negative numbers)]
- unsigned right shift (>>>) [Shifts the bits of an integer to the right by a specified number of positions. Zeros are filled in on the left.]
 Example; 
int number = 50 >>> 2 -> Then binary representation of 50 is 110010. 
Now right shift by 2 positions, then it would be 001100 which is equal to 12