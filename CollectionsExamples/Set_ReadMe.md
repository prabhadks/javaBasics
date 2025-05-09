# Understanding `Set` in Java

This document provides a clear explanation of the `Set` interface in Java, its behavior, underlying data structures, and implementations.

---

## ✅ Set in Java

- `Set` is an **interface** in Java that extends the `Collection` interface.
- It represents a **collection of unique elements**, meaning it **does not allow duplicates**.
- Depending on the implementation, accessing elements in a `Set` can be **faster than a `List`**, especially with hash-based sets.
- **Hashing** is used to store elements efficiently. The position of each element is determined by its `hashCode()` value, allowing fast lookup and insertion.
- Unlike a `List`, a `Set` **does not maintain element order**, unless using a specific implementation like `LinkedHashSet`.

---

## 🌳 Tree Data Structure (Concept)

- A **Tree** is a non-linear data structure, often used to store sorted or hierarchical data.
- In a **Binary Search Tree (BST)**:
  - Values **less than** a node go to the **left**.
  - Values **greater than** a node go to the **right**.
- This structure supports faster element access compared to a `LinkedList`, especially for sorted data.

---

## 🔨 Implementations of `Set`

### 1. `HashSet`
- Uses a **hash table** internally.
- Does **not maintain any order** of elements.
- Allows storing `null` values.
- Offers **constant time performance** for basic operations like add, remove, and contains (on average).

### 2. `LinkedHashSet`
- Extends `HashSet` and maintains a **doubly-linked list** for insertion order.
- Preserves the order in which elements are added.
- Slightly slower than `HashSet` due to overhead of maintaining the order.

### 3. `TreeSet`
- Implements the `NavigableSet` interface and is backed by a **Red-Black Tree**.
- Maintains elements in **sorted order**.
- Does **not allow `null` elements**.
- Slower than `HashSet` but useful when sorted order is required.

---

## ⚠️ Note on TreeMap

- `TreeMap` is **not a `Set`** implementation.
- It implements the `Map` interface and stores **key-value pairs** in sorted order.
- Internally, `TreeSet` is backed by a `TreeMap`, but the two serve different purposes.

---

## 📘 Summary

| Implementation   | Maintains Order | Allows Null | Sorted | Performance |
|------------------|------------------|-------------|--------|-------------|
| `HashSet`        | ❌ No             | ✅ Yes       | ❌ No   | 🔼 Fastest   |
| `LinkedHashSet`  | ✅ Insertion      | ✅ Yes       | ❌ No   | 🔼 Fast      |
| `TreeSet`        | ✅ Sorted         | ❌ No        | ✅ Yes  | ⚖️ Slower    |

---

"Both HashSet and LinkedHashSet implement the Set interface and provide common set operations. In contrast, TreeSet implements both Set and NavigableSet interfaces, offering additional methods for navigation and range-based operations."

Feel free to explore the example code in this repository to deepen your understanding of how `Set` works in Java!
