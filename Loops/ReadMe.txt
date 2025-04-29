When a task needs to be repeated multiple times — whether we know how many times or not — **loops** are the way to go. They help avoid writing the same code over and over again.

For Loop – Best for Known Counts

Use a `for` loop when you know exactly how many times the task should repeat. It has three parts built right into its structure:

1. **Initialization** – Set the starting value of the loop counter.
2. **Condition Check** – The loop continues only if this is true.
3. **Update (Increment/Decrement)** – This moves the counter closer to the end.

Because the increment or decrement is part of the syntax, `for` loops rarely result in infinite loops.


**While Loop – Best for Unknown Counts**

Use a `while` loop when you **don’t know ahead of time** how many times the loop will run. It checks the condition **before** executing the loop body.

However, you must **manually include the increment or decrement inside the loop body**. If you forget it, the loop might run forever.

**Do-While Loop – Guaranteed One Execution**

A `do-while` loop works just like a `while` loop, but with one key difference: it **executes the body first**, then checks the condition.

This guarantees the loop body runs **at least once**, regardless of whether the condition is true initially.

**Loop Control Statements**

- **`break`** – Immediately stops the loop, even if the condition is still true.
- **`continue`** – Skips the current iteration and moves to the next one.
