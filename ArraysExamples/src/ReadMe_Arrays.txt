1. Arrays are used to store more than one value belonging to same datatype in a single variable.
2. If array is declared as int, then only int type data can be stored at each index and no other data type is compatible
3. Each element in the array can be set or accessed by its index
4. Elements of index in an array ranges from 0 to n-1. Where n equals total number of elements (values) in an array. 0 is the first element in an array
5. Different ways of declaring an array:
a) <datatype>[] variableName = new <datatype>[arraylength];
b) <datatype> variableName[] = new <datatype>[arraylength]; 

//Note: first way of declaring is recommended.

6. Declaration and Initialization with values
a) <datatype>[] variableName = {value1, value2, ...}; 
b) <datatype>[] variableName = new <datatype>[]{value1, value2, ...};

[number of values are provided with comma separated]

7. Declaration and intialization separately
<datatype>[] variableName;
variableName = new <datatype>[] {value1, value2, ...};

8. Java supports multidimensional arrays as well.
<datatype>[][] variableName = new <datatype>[arraylength1][arraylength2];

8. Arrays is a class that has inbuilt methods to sort the elements in array, identify the length of array, etc.,

9. Accessing the index that doesn't exist in an array results in "Array Index Out of Bound Exception"

10. Arrays have a fixed size.