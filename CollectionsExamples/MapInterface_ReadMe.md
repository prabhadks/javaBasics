## Understanding `Map` in Java Collections Framework

`Map` is a part of the **Java Collections Framework**, but it **does not extend the `Collection` interface**. It is specifically designed for storing **key-value pairs**, where each **key** maps to exactly one **value**.

### Key Implementations of `Map`
- **`HashMap`**: Stores elements using a **hash table**. Does not guarantee any specific order.
- **`LinkedHashMap`**: Maintains the **insertion order** of keys.
- **`Hashtable`**: Similar to `HashMap`, but is **synchronized** (thread-safe) and generally slower.
- **`TreeMap`**: Implements both `Map` and `NavigableMap` interfaces. Maintains **sorted order** of keys based on their natural ordering or a custom `Comparator`.

### Core Characteristics
- Maps use **hashing** to store and retrieve data efficiently. The `hashCode()` method is used to calculate the storage index for keys.
- Each key in a `Map` must be **unique**, but values can be **duplicate**.

### Commonly Used Methods in `Map`
| Method | Description |
|--------|-------------|
| `get(Object key)` | Retrieves the value associated with the specified key. |
| `put(K key, V value)` | Inserts a new key-value pair or updates the value for an existing key. |
| `remove(Object key)` | Removes the mapping for a key if it exists. |
| `containsKey(Object key)` | Checks if a specific key exists in the map. |
| `containsValue(Object value)` | Checks if the map contains a specific value. |
| `keySet()` | Returns a `Set` view of all the keys. |
| `values()` | Returns a `Collection` view of all the values. |
| `entrySet()` | Returns a `Set` of `Map.Entry` objects (each contains a key-value pair). |
| `isEmpty()` | Checks if the map is empty. |
| `size()` | Returns the number of key-value mappings in the map. |
| `clear()` | Removes all mappings from the map. |

### Important Notes:
- When using `TreeMap`, the keys must be **comparable** (implementing `Comparable` interface) or a custom `Comparator` must be provided; otherwise, a runtime exception will occur.
- `LinkedHashMap`
