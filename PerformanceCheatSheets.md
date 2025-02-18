## Collection Classes Performance Cheat Sheet

Understanding the time complexity for common operations is crucial for the exam. Here's a summary for each core implementation:

| Java Type   | Parent Interface | Access (get)  | Insertion (End)          | Insertion (Middle) | Deletion       | Search              | Ordering / Special          |
|-------------|------------------|---------------|--------------------------|--------------------|----------------|---------------------|-----------------------------|
| ArrayList   | List             | O(1)          | O(1)* amortized          | O(n)               | O(n)           | O(n) (linear scan)  | Maintains insertion order   |
| LinkedList  | List, Queue      | O(n)          | O(1) at ends             | O(n)               | O(1) at ends   | O(n) (linear scan)  | Maintains insertion order   |
| HashSet     | Set              | N/A           | O(1) average             | N/A                | O(1) average   | O(1) average        | Unordered, fast lookups     |
| TreeSet     | Set              | N/A           | O(log n)                 | N/A                | O(log n)       | O(log n)            | Sorted (natural order)      |
| HashMap     | Map              | N/A           | O(1) average for put     | N/A                | O(1) average   | O(1) average        | Unordered keys              |
| TreeMap     | Map              | N/A           | O(log n) for put         | N/A                | O(log n)       | O(log n)            | Sorted by keys (natural order) |

> **Note:** For `ArrayList`, insertion at the end is amortized O(1) due to occasional resizing.

---

Use this cheat sheet to quickly review key attributes and performance characteristics. 
