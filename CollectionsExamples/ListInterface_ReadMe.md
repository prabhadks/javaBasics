The List interface in Java is a part of the Java Collections Framework and extends the Collection interface. It represents an ordered collection where elements are stored in a sequence, and insertion order is maintained.

By default, new elements are added at the end of the list, but List provides methods to add, update, or remove elements at specific indices, offering flexibility in how elements are accessed and manipulated.

The List interface allows:

- Duplicate elements
- null values (implementation-dependent behavior may vary)

Common classes that implement the List interface include:
- ArrayList
- LinkedList
- Vector

Each of these implementations has its own performance characteristics and internal structure.

Here’s a **comparison table** of the three most common `List` implementations in Java: `ArrayList`, `LinkedList`, and `Vector`.

---

### ✅ Comparison: `ArrayList` vs `LinkedList` vs `Vector`

| Feature                           | `ArrayList`                 | `LinkedList`                          | `Vector`                          |
| --------------------------------- | --------------------------- | ------------------------------------- | --------------------------------- |
| **Underlying Data Structure**     | Dynamic array               | Doubly linked list                    | Dynamic array                     |
| **Insertion Order**               | Maintains order             | Maintains order                       | Maintains order                   |
| **Random Access**                 | Fast (O(1))                 | Slow (O(n))                           | Fast (O(1))                       |
| **Insertion/Deletion (middle)**   | Slower (shifting needed)    | Faster (no shifting, just relink)     | Slower (shifting needed)          |
| **Thread Safety**                 | ❌ Not synchronized          | ❌ Not synchronized                    | ✅ Synchronized (thread-safe)      |
| **Performance (Single Threaded)** | Better than `Vector`        | Good for frequent insertions/removals | Slower due to synchronization     |
| **Allows Duplicates**             | ✅ Yes                       | ✅ Yes                                 | ✅ Yes                             |
| **Allows Nulls**                  | ✅ Yes                       | ✅ Yes                                 | ✅ Yes                             |
| **Use Case**                      | Frequent access & iteration | Frequent insertions/deletions         | Legacy code needing thread safety |

---

### 🧠 Summary:

* Use **`ArrayList`** when you need **fast access** and rarely insert/remove from the middle.
* Use **`LinkedList`** when you do a lot of **insertions/removals**, especially at the beginning or middle.
* Use **`Vector`** if you need a **synchronized list**, though modern code prefers `Collections.synchronizedList(new ArrayList<>())`.

