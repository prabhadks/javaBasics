## Data Structures Used in Java Collections Framework

| Collection Class     | Underlying Data Structure(s)                          | Ordering           | Key Features                               |
|----------------------|--------------------------------------------------------|--------------------|--------------------------------------------|
| **ArrayList**         | Dynamic Array                                          | Insertion Order    | Resizable array, fast access by index.    |
| **LinkedList**        | Doubly Linked List                                    | Insertion Order    | Efficient insertion/deletion at both ends. |
| **Vector**            | Dynamic Array (similar to ArrayList)                   | Insertion Order    | Synchronized, slower than ArrayList.       |
| **HashSet**           | Hash Table (HashMap backing structure)                 | No Order           | Unordered, no duplicates.                 |
| **LinkedHashSet**     | Hash Table + Doubly Linked List                       | Insertion Order    | Maintains insertion order.                |
| **TreeSet**           | Red-Black Tree                                        | Sorted (Natural or Custom Comparator) | Ordered, no duplicates.                    |
| **HashMap**           | Hash Table (HashMap backing structure)                 | No Order           | Key-value pair storage, no order.         |
| **Hashtable**         | Hash Table (Similar to HashMap)                        | No Order           | Synchronized, slower than HashMap.        |
| **LinkedHashMap**     | Hash Table + Doubly Linked List                        | Insertion Order    | Maintains insertion order with key-value pairs. |
| **TreeMap**           | Red-Black Tree                                        | Sorted (Natural or Custom Comparator) | Key-value pair storage, ordered by key.  |

---

### Other Data Structures in Collections Framework (Additional)

| Collection Class     | Underlying Data Structure(s)                          | Ordering           | Key Features                               |
|----------------------|--------------------------------------------------------|--------------------|--------------------------------------------|
| **PriorityQueue**     | Heap (Binary Heap by default)                          | Sorted (based on priority) | Implements a priority queue, elements ordered by priority. |
| **Deque (ArrayDeque/LinkedList)** | Dynamic Array or Doubly Linked List           | Insertion Order    | Double-ended queue (efficient insertion/removal at both ends). |
| **Stack**             | Array or Linked List (extends Vector)                  | Insertion Order    | LIFO (Last In First Out) behavior.         |

---

This covers a broad range of classes in the Collections Framework. It’s essential to note that while `HashMap` and `HashSet` use hashing for quick lookups and storage, others like `TreeMap` and `TreeSet` use tree-based data structures to maintain order.

