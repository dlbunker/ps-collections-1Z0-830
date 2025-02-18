## Basic Collection Type Attributes and Characteristics

You should be able to answer the following questions about each core Collection type:

|      | Elements Ordered?          | Allows Duplicates? | Elements Added/Removed in a Certain Order? | Allows Key/Values?  |
|------|----------------------------|--------------------|---------------------------------------------|---------------------|
| List | Yes – Numbered Index       | Yes                | No                                          | No                  |
| Set  | No                         | No                 | No                                          | No                  |
| Queue| Yes – Insertion Order      | Yes                | Yes                                         | No                  |
| Map  | No                         | Yes – Values only  | No                                          | Yes                 |

---

## Specific Collection Type Attributes and Characteristics

You should be able to answer the following questions about each Collection implementation provided by Java:

| Java Type  | Parent Interface Type | Allows Null? | Elements Sorted? | Uses hashCode? | Uses compareTo? |
|------------|-----------------------|--------------|------------------|----------------|-----------------|
| ArrayList  | List                  | Yes          | No               | No             | No              |
| LinkedList | List and Queue        | Yes          | No               | No             | No              |
| HashSet    | Set                   | Yes          | No               | Yes            | No              |
| TreeSet    | Set                   | No           | Yes              | No             | Yes             |
| HashMap    | Map                   | Yes          | No               | Yes            | No              |
| TreeMap    | Map                   | No           | Yes              | No             | Yes             |

---

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

Use this cheat sheet to quickly review key attributes and performance characteristics. These details are not only vital for writing efficient code but also frequently appear as exam questions in the Java 21 exam.
