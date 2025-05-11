
# 📘 Functional Programming in Java (with Streams, Lambda, and Optional)

## ✅ What is Functional Programming?

Functional programming is a way of writing code that focuses on **what needs to be done**, instead of **how** it is done. It:

- Uses **functions** to do work
- Avoids changing values (i.e., it uses **immutable** data)
- Helps write **cleaner and more reliable** code

---

## 🔹 Lambda Expressions

A **lambda expression** is a short way to write a function without giving it a name.

**Example:**
```java
(a, b) -> a + b
```

This is the same as writing a method like:
```java
int add(int a, int b) {
    return a + b;
}
```

Lambdas help make your code shorter and easier to read.

---

## 🔹 What Are Streams?

Streams help you **work with a group of data (like a list)** using a series of steps.

You can:
- **Filter** data
- **Change** each item
- **Remove duplicates**
- **Sort** the data
- **Find totals or specific values**

Streams are made up of two types of steps:

### 🌀 Intermediate Operations (like a pipeline)

These are the steps that get the stream ready, but don’t do the work yet:

| Operation    | What it does                        |
|--------------|-------------------------------------|
| `filter()`   | Keeps only items that match a rule  |
| `map()`      | Changes each item                   |
| `distinct()` | Removes duplicates                  |
| `sorted()`   | Sorts the items                     |

**Example:**
```java
List<Integer> result = List.of(1, 2, 2, 3, 4).stream()
    .filter(n -> n > 2)
    .distinct()
    .sorted()
    .collect(Collectors.toList());
```

---

### ✅ Terminal Operations (do the work and give a result)

These steps **finish the stream** and return something:

| Operation     | What it does                                |
|----------------|---------------------------------------------|
| `forEach()`     | Goes through each item                     |
| `collect()`     | Collects stream results into a list or set |
| `reduce()`      | Combines all items into one value          |
| `max()` / `min()` | Finds the biggest or smallest value       |

**Example:**
```java
int sum = List.of(1, 2, 3, 4).stream()
    .reduce(0, (a, b) -> a + b);  // sum = 10
```

---

## 🔍 What is Optional?

Sometimes, you try to get a result, but it may not exist. Java uses `Optional<T>` to handle this safely.

**Example:**
```java
Optional<Integer> max = list.stream().max(Comparator.naturalOrder());

if (max.isPresent()) {
    System.out.println(max.get());
}

System.out.println(max.orElse(0)); // returns 0 if no value found
```

This helps avoid errors like `NullPointerException`.

---

## 🧠 Summary

| Feature       | What it Means                                   |
|---------------|--------------------------------------------------|
| **Lambda**    | A short, unnamed function                        |
| **Stream**    | A pipeline for working with data                 |
| **filter()**  | Keep only items that match a rule                |
| **map()**     | Change or transform each item                    |
| **reduce()**  | Combine items into one (like a total)            |
| **Optional**  | A safe wrapper for values that might be missing  |
