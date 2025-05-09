## Understanding Java Queue and PriorityQueue

A **Queue** is a type of collection used to store elements in a specific order, often based on **priority**. 

### Ordering:
- By default, it uses **natural ordering** (e.g., ascending for numbers).
- Custom ordering can be implemented using the **Comparator** interface. 
  - You can define your sorting logic in a class that implements `Comparator`, then pass its instance when creating the queue.

### Accessing Elements:
- Use `peek()` to view the head element without removing it.
- Use `poll()` to retrieve and remove the head element.
- Directly printing the queue (`System.out.println(queue)`) does **not** guarantee priority order visibility.

### Other Supported Operations:
- `add(E e)`: Inserts the specified element.
- `addAll(Collection<? extends E> c)`: Adds all elements from another collection.
- `remove(Object o)`: Removes a specific element.
- And other standard Collection Framework methods.

> 💡 Note: Internally, `PriorityQueue` is implemented using a **heap**, so elements may not appear sorted unless polled.

