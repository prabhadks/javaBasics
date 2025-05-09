# 📘 Generics in Java

Generics in Java enable developers to write more flexible, reusable, and type-safe code. By allowing classes, interfaces, and methods to operate on **objects of various types** while providing **compile-time type safety**, Generics eliminate the need for casting and reduce runtime errors.

---

## 🔤 What Are Generics?

Generics allow you to create classes or methods where the type is **not specified upfront**. This enables writing code that works for different data types while maintaining **type safety**.

---

## 🔄 Where Can Generics Be Used?

| Level         | Description                                                                 |
|---------------|-----------------------------------------------------------------------------|
| **Class Level** | The generic type is defined for the entire class and used throughout the class. |
| **Method Level** | The generic type is scoped only to the method.                            |

---

## 🧰 Common Syntax & Examples

### ✅ 1. **Unbounded Type Parameter**

```java
public class Box<T> {
    private T value;
    public void setValue(T value) { this.value = value; }
    public T getValue() { return value; }
}
```

- `T` can be any type (Integer, String, Double, etc.).
- Used for maximum flexibility without constraints.

---

### ✅ 2. **Bounded Type Parameter**

```java
public class Sum<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
```

- `<T extends Number>` restricts `T` to `Number` and its subclasses (e.g., `Integer`, `Double`, `Float`).
- Ensures the type has numeric behavior (like `doubleValue()` method).

---

### ✅ 3. **Wildcard: Upper Bound `<? extends Type>`**

```java
public void printNumbers(List<? extends Number> numbers) {
    for (Number n : numbers) {
        System.out.println(n);
    }
}
```

- Accepts any list where the element is `Number` or a subclass.
- ✅ Safe to **read**
- ❌ **Cannot add** elements (except `null`) because the exact type is unknown at compile-time.

---

### ✅ 4. **Wildcard: Lower Bound `<? super Type>`**

```java
public void addNumbers(List<? super Integer> list, Integer value) {
    list.add(value); // Safe to add Integer
}
```

- Accepts a list of `Integer` or any superclass (e.g., `Number`, `Object`).
- ✅ Safe to **add** an `Integer`
- ❌ **Cannot safely read** (because returned type could be `Object`)

---

## 🔍 Comparison Table

| Use Case        | Syntax                     | Add | Read | Example Use Case                                  |
|----------------|----------------------------|-----|------|---------------------------------------------------|
| Unbounded       | `T`                        | ✅  | ✅   | Generic containers, utility methods               |
| Bounded         | `<T extends Number>`       | ✅  | ✅   | Type-safe numeric operations                      |
| Upper Bound     | `<? extends Number>`       | ❌  | ✅   | Read-only operations on generic numeric lists     |
| Lower Bound     | `<? super Integer>`        | ✅  | ❌   | Adding elements to generic collections            |

---

## 🚫 Invalid Use Cases

```java
// ❌ Invalid: wildcard type cannot be used as a method parameter type
public void add(List<? super Integer> list, ? super Integer value) { } 
```

Instead, use:

```java
public void add(List<? super Integer> list, Integer value) { }
```

---

## 📌 Summary

- Use `T` when you **control the type** in class or method.
- Use `<? extends T>` for **reading**, not writing.
- Use `<? super T>` for **writing**, not reading.
- Use **bounded types** when you want to **limit the acceptable types** to a certain hierarchy.

---
